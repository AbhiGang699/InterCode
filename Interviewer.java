/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softablitz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
/**
 *
 * @author fizaa
 */
public class Interviewer extends javax.swing.JFrame {

    private final static int port = 8888;
    static ServerSocket ssock = null;
    static DataOutputStream dos;
    static DataInputStream dis;
    public static Connection conn = null;
    static String s1;
    /**
     * Creates new form Interviewer
     */
 public static Connection establishConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softablitz","root","ishika");//connecting to sql database
        }catch (Exception e){
            e.printStackTrace();  
        }
        finally{
            return conn;
        }
    }
    public Interviewer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame2 = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatlog = new javax.swing.JTextArea();
        send = new javax.swing.JButton();
        msginp = new javax.swing.JTextField();
        det = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sin = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        frame2.setTitle("Interviewee Details");
        frame2.getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID : ");
        frame2.getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 90, 71, 22);
        frame2.getContentPane().add(id);
        id.setBounds(270, 90, 290, 26);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Name : ");
        frame2.getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 150, 80, 22);
        frame2.getContentPane().add(name);
        name.setBounds(270, 150, 290, 26);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone :");
        frame2.getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 210, 80, 22);
        frame2.getContentPane().add(phone);
        phone.setBounds(270, 210, 290, 26);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email : ");
        frame2.getContentPane().add(jLabel12);
        jLabel12.setBounds(150, 280, 90, 22);
        frame2.getContentPane().add(email);
        email.setBounds(270, 270, 290, 26);

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(add);
        add.setBounds(140, 360, 107, 46);

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(clear);
        clear.setBounds(290, 360, 118, 46);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        frame2.getContentPane().add(exit);
        exit.setBounds(460, 360, 120, 46);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Interviewee Details");
        frame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fizaa\\OneDrive\\Desktop\\newbg.png")); // NOI18N
        frame2.getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 760, 610);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interviewer");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        chatlog.setEditable(false);
        chatlog.setColumns(20);
        chatlog.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        chatlog.setLineWrap(true);
        chatlog.setRows(5);
        jScrollPane1.setViewportView(chatlog);

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        msginp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msginpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msginp, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(send))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msginp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        det.setText("Details");
        det.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detActionPerformed(evt);
            }
        });

        code.setBackground(new java.awt.Color(0, 0, 0));
        code.setColumns(20);
        code.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        code.setForeground(new java.awt.Color(255, 255, 255));
        code.setRows(5);
        jScrollPane2.setViewportView(code);

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel4.setText("Language : ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java", "Python" }));

        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel5.setText("Input : ");

        sin.setColumns(20);
        sin.setRows(5);
        jScrollPane3.setViewportView(sin);

        jButton1.setText("Compile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Run");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(det)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, 129, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(det)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
   try
   {//sending messages
       String a=msginp.getText();
       dos.writeUTF(a);
       chatlog.setText(chatlog.getText()+"\n Me : "+a);
       msginp.setText("");
   }catch(Exception e){
       System.out.println(e);
   }
    }//GEN-LAST:event_sendActionPerformed

    private void msginpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msginpActionPerformed
     try
   {
       String a=msginp.getText();
       dos.writeUTF(a);
       chatlog.setText(chatlog.getText()+"\n Me : "+a);
       msginp.setText("");
           
   }catch(Exception e){
       System.out.println(e);
   }
    }//GEN-LAST:event_msginpActionPerformed

    private void detActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detActionPerformed
    frame2.setVisible(true); //creating a frame for entering details of interviewee 
    frame2.setSize(700,500);
    }//GEN-LAST:event_detActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    frame2.setVisible(false);//exiting frame
    }//GEN-LAST:event_exitActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    id.setText("");
    name.setText("");
    phone.setText("");
    email.setText("");

    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       String q="Insert into interviewees values('" + id.getText() + "','" + name.getText() + "','" + phone.getText() + "','" + email.getText() + "',null,null);";
       try{
       //entering values into sql database
       PreparedStatement st = conn.prepareStatement(q);
       st.executeQuery(q);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_addActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{  
          s1="Select ID from interviewees;";
            Statement stm=conn.createStatement();
            ResultSet rst=stm.executeQuery(s1);
            while(rst.next()){
                String i=rst.getString("i");
                System.out.println("id="+i);
            }}catch(Exception e){
                    System.out.println(e.getMessage());
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Interviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interviewer().setVisible(true);
            }});
                Socket sock = null;
                try{
            ssock = new ServerSocket(port);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error occured...failed to initialize Server Socket");
        }

        while(true){
            try{
            	System.out.println("Waiting for connection..!!");
                sock = ssock.accept();
                System.out.println("Connection received...!!!");
                dos = new DataOutputStream(sock.getOutputStream());
                dis = new DataInputStream(sock.getInputStream());
                String msg = "";  
                while(!msg.equals("Exit"))  
            
               {  
                msg=dis.readUTF();  
                chatlog.setText(chatlog.getText()+"\n Interviewee : "+msg);  
               }  
               
               }catch(Exception e){
                e.printStackTrace();
                System.out.println("Failed to connect to client..!!");
                }
            
        }
            
            
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private static javax.swing.JTextArea chatlog;
    private javax.swing.JButton clear;
    private javax.swing.JTextArea code;
    private javax.swing.JButton det;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JFrame frame2;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField msginp;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton send;
    private javax.swing.JTextArea sin;
    // End of variables declaration//GEN-END:variables
}
