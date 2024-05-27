import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RCh
 */
public class Reservation extends javax.swing.JFrame {

   Client c;
   
   public Reservation(Client c){
        this.c = c;
        initComponents();
   } 
    // Конструктор класса
    public Reservation() throws IOException, ClassNotFoundException {
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
        ID = new javax.swing.JTextField();
        Napartb = new javax.swing.JTextField();
        Reserv = new javax.swing.JTextField();
        dnReserv = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
                "ID", "Номер апартов", "Начало брони", "Конец брони"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
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
        }

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        Napartb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NapartbActionPerformed(evt);
            }
        });

        Reserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Постояльца");

        jLabel3.setText("Номер апартов");

        jLabel4.setText("Дата начала брони");

        jLabel5.setText("Дата конца брони");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ID)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Napartb)
                            .addComponent(Reserv)
                            .addComponent(dnReserv)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Napartb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dnReserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void Check_inActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new Check_in(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                        

    private void ApartActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new Apart(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                     

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
       try {
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           LinkedList<String> answer = new LinkedList<>();
           int row = jTable1.getSelectedRow();
           String s = (String) model.getValueAt(row, 0);
           String request = "delReserv";
           c.del(request, s);
           request = "selectReserv";
           answer = c.refresh(request);
           refreshReserv(answer);
       } catch (IOException | InterruptedException | ClassNotFoundException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }                                      

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        c.end();
    }                                  

    void refreshReserv(LinkedList<String> answer){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        while (rows != 0) {
            model.removeRow(0);
            rows--;
        }
        Object[] row;
          for (int i = 0; i < answer.size(); i = i+4){
            row = new Object[4];
            row[0] = answer.get(i);
            row[1] = answer.get(i+1);
            row[2] = answer.get(i+2);
            row[3] = answer.get(i+3);
            model.addRow(row);
          }
    }
    
    private void PostActionPerformed(java.awt.event.ActionEvent evt) {                                     
        new Postoyalec(c).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }                                    

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {                                     
       try {
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           LinkedList<String> answer = new LinkedList<>();
           int rows = jTable1.getRowCount();
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < 4; j++) {
                   answer.add((String) model.getValueAt(i, j));
               }
           }
           String request = "updateReserv";
           c.update(request, answer);
           request = "selectReserv";
           answer = c.refresh(request);
           refreshReserv(answer);
       } catch (IOException | ClassNotFoundException | InterruptedException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                    

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String newID = ID.getText();
        String napartb = Napartb.getText();
        String startDateStr = Reserv.getText();
        String endDateStr = dnReserv.getText();

        // Проверка на пустые поля
        if (newID.isEmpty() || napartb.isEmpty() || startDateStr.isEmpty() || endDateStr.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Все поля должны быть заполнены.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        boolean idExists = false;

    // Проверка на существующий ID
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(newID)) {
                idExists = true;
            break;
            }
        }

            if (idExists) {
                javax.swing.JOptionPane.showMessageDialog(this, "ID уже существует. Введите уникальный ID.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
            }

    // Проверка дат
            try {
                java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");
                java.util.Date startDate = dateFormat.parse(startDateStr);
                java.util.Date endDate = dateFormat.parse(endDateStr);

            if (endDate.before(startDate)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Дата конца брони должна быть больше чем дата начала брони.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
            }
        } catch (java.text.ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Неверный формат даты. Используйте формат yyyy-MM-dd. Обязательно выберите месяца от 01 до 12", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }

    // Добавление новой записи
        LinkedList<String> answer = new LinkedList<>();
        answer.add(newID);
        answer.add(Napartb.getText());
        answer.add(startDateStr);
        answer.add(endDateStr);
        try {
            String request = "addReserv";
            c.add(request, answer);
            request = "selectReserv";
            answer = c.refresh(request);
            refreshReserv(answer);
        } catch (IOException | ClassNotFoundException | InterruptedException ex) {
        Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                   

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       try {
           String request = "selectReserv";
           LinkedList<String> answer = c.refresh(request);
           refreshReserv(answer);
       } catch (IOException | ClassNotFoundException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InterruptedException ex) {
           Logger.getLogger(Check_in.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                 

    private void NapartbActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void ReservActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Check_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton Check_in;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Napartb;
    private javax.swing.JButton Post;
    private javax.swing.JTextField Reserv;
    private javax.swing.JButton Reservation;
    private javax.swing.JButton Save;
    private javax.swing.JTextField dnReserv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

}
