package Cliente;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Leo
 */
public class Banco {
        
    private static final List<Conta> contas= new ArrayList<Conta>() ;
    private static final long serialVersionUID = 1L;
    
    public Banco(){
        super();
    }

    public boolean verificaSenha(int numeroConta,int senha){
        for(Conta c: contas){
            if(numeroConta==c.getNumeroConta() && senha==c.getSenha()){
                return true;
            }
        }
        return false;
    }
    
    public boolean abrirConta(int numeroConta, int senha){
        for(Conta c:contas){
            if(numeroConta==c.getNumeroConta()){
                return false;
            }
        }
        Conta novaConta;
        novaConta = new Conta(numeroConta,senha);
        contas.add(novaConta);
        //System.out.println(getContas());
        return true;
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

    public boolean depositar(int conta, double valor){
        for(Conta c: contas){
            if(conta==c.getNumeroConta()){
                c.depositar(valor);
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

    public boolean saque(int conta, double valor){
        for(Conta c: contas){
            if(conta==c.getNumeroConta()){
                return c.saque(valor);
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