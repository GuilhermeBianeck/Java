package Cliente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Leo
 */
public class Banco {
        
    private static final List<Conta> contas= new ArrayList<Conta>() ;
    private static final long serialVersionUID = 1L;
    private static double saldoCaixa = 500.0;
    
    public Banco() throws FileNotFoundException, IOException{
        super();
        carregaContas();
    }

    private void carregaContas() throws FileNotFoundException, IOException{
        File directory=new File("DB");
        if(directory.mkdirs()){
            System.out.println("Diretorio criado com sucesso");
        }
        File[] faFiles = new File("DB").listFiles();
        BufferedReader reader = null;
        int conta,senha;
        double saldo;
        for(File file: faFiles){
            if(file.getName().matches("^(.*?)")){
                
                System.out.println(file.getPath());
                System.out.println(file.getName());
                File file2 = new File(file.getPath());
                reader= new BufferedReader(new FileReader(file2));
                conta=Integer.parseInt(reader.readLine());
                senha=Integer.parseInt(reader.readLine());
                saldo=Double.parseDouble(reader.readLine());
                abrirConta(conta,senha,saldo);
                depositar(conta,saldo);
            }
        }
    }
    
    public boolean verificaSenha(int numeroConta,int senha){
        for(Conta c: contas){
            if(numeroConta==c.getNumeroConta() && senha==c.getSenha()){
                return true;
            }
        }
        return false;
    }
    
    public boolean abrirConta(int numeroConta, int senha, double saldo) throws FileNotFoundException, UnsupportedEncodingException{
        for(Conta c:contas){
            if(numeroConta==c.getNumeroConta()){
                return false;
            }
        }
        Conta novaConta;
        novaConta = new Conta(numeroConta,senha);
        contas.add(novaConta);
        //System.out.println(getContas());
        salvarArquivoConta(numeroConta,senha,saldo);
        return true;
    }
    
    public void salvarArquivoConta(int numeroConta,int senha,double saldo) throws FileNotFoundException, UnsupportedEncodingException{
        StringBuilder sb = new StringBuilder();
        sb.append("./DB/");
        sb.append(numeroConta);
        
        PrintWriter writer= new PrintWriter(sb.toString()+".txt","UTF-8");
        
        sb.setLength(0);
        sb.append("");
        sb.append(numeroConta);
        
        writer.println(sb);
        
        sb.setLength(0);
        sb.append("");
        sb.append(senha);
        
        writer.println(sb);
        
        
        sb.setLength(0);
        sb.append("");
        sb.append(saldo);
        writer.println(sb);
        
        writer.close();
        
    }

    public boolean removerConta(int numeroConta, int senha){
        for(Conta c: contas){
            if (numeroConta==c.getNumeroConta()){
                contas.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean depositar(int conta, double valor) throws FileNotFoundException, UnsupportedEncodingException{
        for(Conta c: contas){
            if(conta==c.getNumeroConta()){
                c.depositar(valor);
                salvarArquivoConta(conta,c.getSenha(),c.getSaldo());
                return true;
            }
        }
        return false;
    }

    public String saldo(int conta){
        for(Conta c: contas){
            if(conta==c.getNumeroConta()){
                return String.valueOf(c.getSaldo()); 
            }
        }
        return "";
    }

    public boolean saque(int conta, double valor) throws FileNotFoundException, UnsupportedEncodingException{
        for(Conta c: contas){
            if(conta==c.getNumeroConta()){
                if(c.saque(valor)){
                    salvarArquivoConta(conta,c.getSenha(),c.getSaldo());
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean transferencia(int origem, int destino, double valor){
        for (Conta c: contas){
            if (origem==c.getNumeroConta()){
                for (Conta c2: contas){
                    if(destino==c2.getNumeroConta()){
                        return c.tranferir(valor, c2);
                    }
                }
            }
        }
        return false;
    }
    
    public List<Conta> getContas() {
        return contas;
    }
    
    public void setContas(List <Conta> cont){
        cont.stream().forEach((c) -> {
            //System.out.println(c);
            contas.add(c);
        });
    }
    
    public void cleanContas(){
        contas.clear();
    }
    
}