package Cliente;

import java.io.IOException;

/**
 *
 * @author Leo
 */
public class Cliente{

    public static void main(String[] args) throws IOException{
        ClienteGUI Tgui = new ClienteGUI();
        Banco banco= new Banco();
        Tgui.setBanco(banco);
        Tgui.setVisible(true);
    }
}
