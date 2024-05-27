import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RCh
 */
public class Apart extends javax.swing.JFrame {

   Client c;
   public Apart(Client c){
       this.c = c;
       initComponents();

   }
    // Конструктор класса
    public Apart() throws IOException, ClassNotFoundException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Post = new javax.swing.JButton();
        Check_in = new javax.swing.JButton();
        Reservation = new javax.swing.JButton();
        Apart = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        NumAp = new javax.swing.JTextField();
        Capacity = new javax.swing.JTextField();
        Comfort = new javax.swing.JTextField();
        Price = new javax.swing.JTextField();
        Free = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Post.setText("Постояльцы");
        Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostActionPerformed(evt);
            }
        });

        Check_in.setText("Заселение");
        Check_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Check_inActionPerformed(evt);
            }
        });

        Reservation.setText("Бронирование");
        Reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationActionPerformed(evt);
            }
        });

        Apart.setText("Апартаменты");
        Apart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApartActionPerformed(evt);
            }
        });

        Save.setText("Сохранить изменения");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Delete.setText("Удалить");
        Delete.setPreferredSize(new java.awt.Dimension(84, 23));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Add.setText("Добавить");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Номер апарт", "Вместимость", "Комфорт", "Стоимость", "Свободно"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        NumAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumApActionPerformed(evt);
            }
        });

        jLabel1.setText("Номер апарт");

        jLabel3.setText("Вместимость");

        jLabel4.setText("Комфорт");

        jLabel5.setText("Стоимость");

        jLabel2.setText("Свободно");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Post)
                        .addGap(56, 56, 56)
                        .addComponent(Check_in)
                        .addGap(56, 56, 56)
                        .addComponent(Reservation)
                        .addGap(56, 56, 56)
                        .addComponent(Apart))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Save)
                        .addGap(105, 105, 105)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumAp)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Capacity)
                                    .addComponent(Comfort)
                                    .addComponent(Price)
                                    .addComponent(Free)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(0, 64, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Post)
                    .addComponent(Check_in)
                    .addComponent(Reservation)
                    .addComponent(Apart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Comfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(Free, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new Reservation(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                           

    private void Check_inActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Check_in(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                        

    private void ApartActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    }                                     

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       try {
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           LinkedList<String> answer = new LinkedList<>();
           int row = jTable1.getSelectedRow();
           String s = (String) model.getValueAt(row, 0);
           String request = "delApart";
           c.del(request, s);
           request = "selectApart";
           answer = c.refresh(request);
           refreshApart(answer);
       } catch (IOException | InterruptedException | ClassNotFoundException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }                                      

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        c.end();
    }                                  

    void refreshApart(LinkedList<String> answer){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        while (rows != 0) {
            model.removeRow(0);
            rows--;
        }
        Object[] row;
          for (int i = 0; i < answer.size(); i = i+5){
            row = new Object[5];
            row[0] = answer.get(i);
            row[1] = answer.get(i+1);
            row[2] = answer.get(i+2);
            row[3] = answer.get(i+3);
            row[4] = answer.get(i+4);
            model.addRow(row);
          }
    }
    
    private void PostActionPerformed(java.awt.event.ActionEvent evt) {                                     
        new Postoyalec(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                    

    private void NumApActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {                                     
       try {
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           LinkedList<String> answer = new LinkedList<>();
           int rows = jTable1.getRowCount();
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < 5; j++) {
                   answer.add((String) model.getValueAt(i, j));
               }
           }
           String request = "updateApart";
           c.update(request, answer);
           request = "selectApart";
           answer = c.refresh(request);
           refreshApart(answer);
       } catch (IOException | ClassNotFoundException | InterruptedException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                    

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String numAp = NumAp.getText();
        String capacity = Capacity.getText();
        String comfort = Comfort.getText();
        String price = Price.getText();
        String freeValue = Free.getText();

        // Проверка на пустые поля
        if (numAp.isEmpty() || capacity.isEmpty() || comfort.isEmpty() || price.isEmpty() || freeValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Все поля должны быть заполнены.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        return;
        }
        if (isNumApExists(numAp)) {
            JOptionPane.showMessageDialog(this, "Апартамент с таким номером уже существует", "Предупреждение", JOptionPane.WARNING_MESSAGE);
        return; // Прерывание операции добавления
        }
        if (!("0".equals(freeValue) || "1".equals(freeValue))) {
            JOptionPane.showMessageDialog(this, "Значение поля 'Свободно' может быть только 0 или 1, где 0 - нет, 1 - да", "Предупреждение", JOptionPane.WARNING_MESSAGE);
        return; // Прерывание операции добавления
        }
        // Проверка значения поля "Comfort"
        if (!("lux".equals(comfort) || "polulux".equals(comfort) || "econom".equals(comfort))) {
            JOptionPane.showMessageDialog(this, "Допустимые значения поля 'Comfort': lux, polulux, econom.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        return; // Прерывание операции добавления
        }
        LinkedList<String> answer = new LinkedList<>();
        answer.add(numAp);
        answer.add(Capacity.getText());
        answer.add(Comfort.getText());
        answer.add(Price.getText());
        answer.add(Free.getText());
    
        try {
            String request = "addApart";
            c.add(request, answer);
            request = "selectApart";
            answer = c.refresh(request);
            refreshApart(answer);
        } catch (IOException | ClassNotFoundException | InterruptedException ex) {
            Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean isNumApExists(String numAp) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                if (numAp.equals(model.getValueAt(row, 0))) {
                return true; // Найден существующий номер апартамента
                }
            }
        return false; // Номер апартамента не найден
    }                                   

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       try {
           String request = "selectApart";
           LinkedList<String> answer = c.refresh(request);
           refreshApart(answer);
       } catch (IOException | ClassNotFoundException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InterruptedException ex) {
           Logger.getLogger(Check_in.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                 

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       //</editor-fold>
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Postoyalec().setVisible(true);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton Add;
    private javax.swing.JButton Apart;
    private javax.swing.JTextField Capacity;
    private javax.swing.JButton Check_in;
    private javax.swing.JTextField Comfort;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Free;
    private javax.swing.JTextField NumAp;
    private javax.swing.JButton Post;
    private javax.swing.JTextField Price;
    private javax.swing.JButton Reservation;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

}
