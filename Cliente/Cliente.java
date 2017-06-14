package Cliente;

/**
 *
 * @author Leo
 */
public class Cliente{

    public static void main(String[] args){
        ClienteGUI Tgui = new ClienteGUI();
        Banco banco= new Banco();
        Tgui.setBanco(banco);
        Tgui.setVisible(true);
    }
}
