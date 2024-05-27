import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RCh
 */
public class Postoyalec extends javax.swing.JFrame {

   Client c;
   public Postoyalec(Client c){
       this.c = c;
       initComponents();

   }
    // Конструктор класса
    public Postoyalec() throws IOException, ClassNotFoundException {
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
        Surname = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Patronymic = new javax.swing.JTextField();
        Passport = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Comment = new javax.swing.JTextField();
        Category = new javax.swing.JTextField();
        Discount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

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
                "ID", "Фамилия", "Имя", "Отчество", "Паспорт", "Адрес", "Комментарий", "Категория", "Скидка"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
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
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
        }

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Постояльца");

        jLabel3.setText("Фамилия");

        jLabel4.setText("Имя");

        jLabel5.setText("Отчество");

        jLabel2.setText("Паспорт");

        jLabel6.setText("Адрес");

        jLabel7.setText("Комментарий");

        jLabel8.setText("Категория");

        jLabel9.setText("Скидка");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Post)
                        .addGap(57, 57, 57)
                        .addComponent(Check_in)
                        .addGap(56, 56, 56)
                        .addComponent(Reservation)
                        .addGap(55, 55, 55)
                        .addComponent(Apart))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Save)
                        .addGap(105, 105, 105)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Surname)
                            .addComponent(Name)
                            .addComponent(Patronymic)
                            .addComponent(Passport)
                            .addComponent(Comment)
                            .addComponent(Category)
                            .addComponent(Discount)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addComponent(Address))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Apart)
                    .addComponent(Reservation)
                    .addComponent(Check_in)
                    .addComponent(Post))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Patronymic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(Passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Comment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
           String request = "delPost";
           c.del(request,s);
           request = "selectPost";
           answer = c.refresh(request);
           refreshPost(answer);
       } catch (IOException | InterruptedException | ClassNotFoundException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }                                      

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        c.end();
    }                                  

    void refreshPost(LinkedList<String> answer){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        while (rows != 0) {
            model.removeRow(0);
            rows--;
        }
        Object[] row;
          for (int i = 0; i < answer.size(); i = i+9){
            row = new Object[9];
            row[0] = answer.get(i);
            row[1] = answer.get(i+1);
            row[2] = answer.get(i+2);
            row[3] = answer.get(i+3);
            row[4] = answer.get(i+4);
            row[5] = answer.get(i+5);
            row[6] = answer.get(i+6);
            row[7] = answer.get(i+7);
            row[8] = answer.get(i+8);
            model.addRow(row);
          }
    }
    
    private void PostActionPerformed(java.awt.event.ActionEvent evt) {                                     
   
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
               for (int j = 0; j < 9; j++) {
                   answer.add((String) model.getValueAt(i, j));
               }
           }
           String request = "updatePost";
           c.update(request, answer);
           request = "selectPost";
           answer = c.refresh(request);
           refreshPost(answer);
       } catch (IOException | ClassNotFoundException | InterruptedException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                    

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {                                    
        String newID = ID.getText();
        String surname = Surname.getText();
        String name = Name.getText();
        String patronymic = Patronymic.getText();
        String passport = Passport.getText();
        String address = Address.getText();
        String comment = Comment.getText();
        String category = Category.getText();
        String discountStr = Discount.getText();
    
         // Проверка на пустые поля
        if (newID.isEmpty() || surname.isEmpty() || name.isEmpty() || patronymic.isEmpty() || passport.isEmpty() || address.isEmpty() || comment.isEmpty() || category.isEmpty() || discountStr.isEmpty()) {
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
            
            // Проверка Discount
            int discount;
            try {
                discount = Integer.parseInt(discountStr);
                if (discount != 5 && discount != 10 && discount != 15) {
                    throw new IllegalArgumentException("Недопустимое значение скидки.");
                    }
               } catch (NumberFormatException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Скидка должна быть числом. Допустимые значения: 5, 10, 15.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
                } catch (IllegalArgumentException e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Допустимые значения скидки: 5, 10, 15.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
                }

            // Проверка Category
                if (!category.equals("Student") && !category.equals("Pensioner") && !category.equals("Postoyalec")) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Допустимые категории: Student, Pensioner, Postoyalec.", "Ошибка", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
                }
        
        LinkedList<String> answer = new LinkedList<>();
        answer.add(ID.getText());
        answer.add(Surname.getText());
        answer.add(Name.getText());
        answer.add(Patronymic.getText());
        answer.add(Passport.getText());
        answer.add(Address.getText());
        answer.add(Comment.getText());
        answer.add(Category.getText());
        answer.add(Discount.getText());
       try {
           String request = "addPost";
           c.add(request, answer);
           request = "selectPost";
           answer = c.refresh(request);
           refreshPost(answer);
       } catch (IOException | ClassNotFoundException | InterruptedException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
       }
    }                                   

    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
       try {
           if (c == null) this.c = new Client();
           //Thread.sleep(1000);
            String request = "selectPost";
           LinkedList<String> answer = c.refresh(request);
           refreshPost(answer);
       } catch (IOException | ClassNotFoundException | InterruptedException ex) {
           Logger.getLogger(Postoyalec.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTextField Address;
    private javax.swing.JButton Apart;
    private javax.swing.JTextField Category;
    private javax.swing.JButton Check_in;
    private javax.swing.JTextField Comment;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Discount;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Passport;
    private javax.swing.JTextField Patronymic;
    private javax.swing.JButton Post;
    private javax.swing.JButton Reservation;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Surname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   

}
