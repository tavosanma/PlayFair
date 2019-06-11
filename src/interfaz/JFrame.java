/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author Tavo
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage(){
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/imagen.jpg"));
         return retValue;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtf = new javax.swing.JTextField();
        codificar = new javax.swing.JButton();
        descifrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PlayFair");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hacker.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese Texto: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        txtf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfActionPerformed(evt);
            }
        });
        getContentPane().add(txtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 283, 310, 30));

        codificar.setBackground(new java.awt.Color(255, 255, 255));
        codificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codificar.setText("Codificar");
        codificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codificarActionPerformed(evt);
            }
        });
        getContentPane().add(codificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        descifrar.setBackground(new java.awt.Color(255, 255, 255));
        descifrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descifrar.setText("Descifrar");
        descifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarActionPerformed(evt);
            }
        });
        getContentPane().add(descifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Texto resultante:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, -1));

        txta.setColumns(20);
        txta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txta.setRows(5);
        jScrollPane2.setViewportView(txta);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 280, -1));

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 485));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfActionPerformed

    private void codificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codificarActionPerformed
        if(txtf.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "inserta un texto por favor");
        } else{
            txta.setText("");
            String input = txtf.getText();
            
            txta.append(cifrarPlayfair(input));
            
            
        }
    }//GEN-LAST:event_codificarActionPerformed

    private void descifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarActionPerformed
        if(txtf.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "inserta un texto por favor");
        }else{
            
            txta.setText("");
            String input = txtf.getText();
            
            txta.append(descifrarPlayfair(input));
        }
    }//GEN-LAST:event_descifrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       
        txtf.setText("");
        txta.setText("");
       
    }//GEN-LAST:event_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }
    
    private static String cifrarPlayfair(String input) {
        
        String output = "";
        char cifrando1;
        char cifrando2;
        String first_letter;
        String second_letter;
        int pos1 = 0;
        int pos2 = 0;
        int posA = 0;
        int posB = 0;
        input = input.toUpperCase();
        //En este cifrado la j se reemplazara por i y ñ por n, no se eliminarán estas letras.
        input = input.replace('J', 'I');
        input = input.replace('Ñ', 'N');
        input = input.replaceAll("[^a-zA-Z]+", "");
        char[][] matrix = new char[][]{
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'},};
        if (input.length() % 2 == 1) {
            input = input + "X";
        }
        for (int c = 0; c < input.length(); c = c + 2) {
            if (c + 1 == input.length()) {
                break;
            }
            cifrando1 = input.charAt(c);
            cifrando2 = input.charAt(c + 1);
            //i corresponde a las filas
            //j corresponde a las columnas
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (cifrando1 == matrix[i][j]) {
                        pos1 = i;
                        pos2 = j;
                    }
                    if (cifrando2 == matrix[i][j]) {
                        posA = i;
                        posB = j;
                    }
                }
            }

            //Comienzo de las condiciones según el cifrado
            //Caso en que vienen 2 letras iguales, toman el valor de la letra de la derecha
            if (pos1 == posA && pos2 == posB) {
                if (pos2 == 4) {
                    pos2 = 0;
                    posB = 0;
                } else {
                    pos2++;
                    posB++;
                }
                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);

                output = output + first_letter + second_letter;

                //Caso chars abajo
            } else if (pos1 == posA) {
                if (pos1 == 4) {
                    pos1 = 0;
                    posA = 0;
                } else {
                    pos1++;
                    posA++;
                }

                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);
                output = output + first_letter + second_letter;

                //caso chars a la derecha
            } else if (pos2 == posB) {
                if (pos2 == 4) {
                    pos2 = 0;
                    posB = 0;
                } else {
                    pos2++;
                    posB++;
                }
                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);
                output = output + first_letter + second_letter;

                //caso chars en distintas filas y columnas, se toma el valor de las filas.
            } else if (pos1 != posA && pos2 != posB) {
                first_letter = String.valueOf(matrix[pos1][posB]);
                second_letter = String.valueOf(matrix[posA][pos2]);
                output = output + first_letter + second_letter;
            }

        }
        return output;
        
    }
    
    
            
    
     private static String descifrarPlayfair(String input) {
        String output = "";
        char cifrando1;
        char cifrando2;
        String first_letter;
        String second_letter;
        int pos1 = 0;
        int pos2 = 0;
        int posA = 0;
        int posB = 0;
        input = input.toUpperCase();
        //En este cifrado la j se reemplazara por i y ñ por n, no se eliminarán estas letras.
        input = input.replace('J', 'I');
        input = input.replace('Ñ', 'N');
        input = input.replaceAll("[^a-zA-Z]+", "");
        char[][] matrix = new char[][]{
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'},};
        if (input.length() % 2 == 1) {
            input = input + "X";
        }
        for (int c = 0; c < input.length(); c = c + 2) {
            if (c + 1 == input.length()) {
                break;
            }
            cifrando1 = input.charAt(c);
            cifrando2 = input.charAt(c + 1);
            //i corresponde a las filas
            //j corresponde a las columnas
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (cifrando1 == matrix[i][j]) {
                        pos1 = i;
                        pos2 = j;
                    }
                    if (cifrando2 == matrix[i][j]) {
                        posA = i;
                        posB = j;
                    }
                }
            }

            //Comienzo de las condiciones según el cifrado
            //Caso en que vienen 2 letras iguales, toman el valor de la letra de la derecha
            if (pos1 == posA && pos2 == posB) {
                if (pos2 == 0) {
                    pos2 = 4;
                    posB = 4;
                } else {
                    pos2--;
                    posB--;
                }
                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);

                output = output + first_letter + second_letter;

                //Caso chars abajo
            } else if (pos1 == posA) {
                if (pos1 == 0) {
                    pos1 = 4;
                    posA = 4;
                } else {
                    pos1--;
                    posA--;
                }

                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);
                output = output + first_letter + second_letter;

                //caso chars a la derecha
            } else if (pos2 == posB) {
                if (pos2 == 0) {
                    pos2 = 4;
                    posB = 4;
                } else {
                    pos2--;
                    posB--;
                }
                first_letter = String.valueOf(matrix[pos1][pos2]);
                second_letter = String.valueOf(matrix[posA][posB]);
                output = output + first_letter + second_letter;

                //caso chars en distintas filas y columnas, se toma el valor de las filas.
            } else if (pos1 != posA && pos2 != posB) {
                first_letter = String.valueOf(matrix[pos1][posB]);
                second_letter = String.valueOf(matrix[posA][pos2]);
                output = output + first_letter + second_letter;
            }

        }
        return output;
        
    }


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton codificar;
    private javax.swing.JButton descifrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextArea txta;
    private javax.swing.JTextField txtf;
    // End of variables declaration//GEN-END:variables
}
