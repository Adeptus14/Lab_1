package colecciones_hashmap;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class EjercicioA {
    /**
     * @author Enzo Rosso Hausberger
     */
public static void main(String[] args) {
    HashMap<String, Long> agenda = new HashMap<>();

    while (true) {
        try{
            int entry = Integer.parseInt(JOptionPane.showInputDialog("---MENU---\n1. Cargar datos\n2. Buscar telefono por nombre\n3. Listar agenda\n0. Exit"));

            if (entry == 0) {
                JOptionPane.showMessageDialog(null, "Good bye!");
                break;
            } else {
                switch (entry) {
                    case 1 -> insertData(agenda);
                    case 2 -> JOptionPane.showConfirmDialog(null, contactFinder(agenda));
                    case 3 -> fullList(agenda);
                    default -> JOptionPane.showMessageDialog(null, "Wrong input");
                }
            }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Wrong input type");
            }
    }
}

    public static void insertData(HashMap<String, Long> hm) {
        while (true) {
            String name = JOptionPane.showInputDialog("Enter a name or nothing to exit: ");
            if (name.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "End of insertion");
                break;
            } else {
                try{
                    Long phone = Long.parseLong(JOptionPane.showInputDialog("Enter a number or 0 to exit: "));
                    hm.put(name, phone);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Wrong input type");
                }
            }
        }

    }

    public static Long contactFinder(HashMap<String, Long> hm) {
        String name = JOptionPane.showInputDialog("Enter a name: ");
        if (hm.containsKey(name)) {
            return hm.get(name);
        }
        return null;
    }

    public static void fullList(HashMap<String, Long> hm){
        StringBuilder msg = new StringBuilder("Contacts:\n");
        for (HashMap.Entry<String, Long> entry : hm.entrySet()) {
            msg.append("\tNombre: ").append(entry.getKey()).append("\n\tNro: ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, msg.toString(),"Agenda\n", JOptionPane.INFORMATION_MESSAGE);
    }

}

