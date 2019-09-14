
package calculator; //FIXED : package name is calculator

import java.awt.Color;
import static java.lang.Double.NaN;
import java.util.ArrayList;

/**
 *
 * @author Shreyas
 */
public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
        txtDisplay.setVisible(true);                                            //FIXED : setVisible to true
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnPro = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnClosePara = new javax.swing.JButton();
        btnOpenPara = new javax.swing.JButton();
        btnNegate = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnShift = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 200));

        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        txtDisplay.setBackground(new java.awt.Color(164, 238, 164));
        txtDisplay.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.setText("0");
        txtDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisplayKeyTyped(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnPro.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnPro.setText("x");
        btnPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEqualMouseEntered(evt);
            }
        });
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnClosePara.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnClosePara.setText(")");
        btnClosePara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseParaActionPerformed(evt);
            }
        });

        btnOpenPara.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnOpenPara.setText("(");
        btnOpenPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenParaActionPerformed(evt);
            }
        });

        btnNegate.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnNegate.setText("±");
        btnNegate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegateActionPerformed(evt);
            }
        });

        btnFact.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnFact.setText("n!");
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });

        btnPi.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        btnPi.setText("π");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });

        btnBackspace.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBackspace.setText("←");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnCancel.setText("C");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTan.setForeground(new java.awt.Color(255, 0, 0));
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSin.setForeground(new java.awt.Color(255, 0, 0));
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCos.setForeground(new java.awt.Color(255, 0, 0));
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        btnMod.setText("%");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLog.setForeground(new java.awt.Color(255, 0, 0));
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnPower.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPower.setText("^");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnShift.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShift.setForeground(new java.awt.Color(255, 0, 0));
        btnShift.setText("↑");
        btnShift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShiftActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCos, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(btnSin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShift, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNegate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpenPara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClosePara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShift, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNegate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClosePara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpenPara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(txtDisplay)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(486, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:factorial
    private void factorial(long num) {
        try {
            long fact=1;
            for (int i=1;i<=num;i++) {
                fact*=i;
                Thread.sleep(500);
            }
            txtDisplay.setText((long)fact+"");
        }
        catch (Exception e) {
            txtDisplay.setText("Error !");
        }
    }// </editor-fold>//GEN-END:factorial
    
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        press('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        if (shift)
            funcCall(ASIN);
        else
            funcCall(SIN);
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnShiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShiftActionPerformed
        if (!shift) {
            shift=true;
            btnShift.setForeground(Color.BLUE);
            btnCos.setForeground(Color.BLUE);
            btnSin.setForeground(Color.BLUE);
            btnTan.setForeground(Color.BLUE);
            btnLog.setForeground(Color.BLUE);
            btnCos.setText("acos");
            btnSin.setText("asin");
            btnTan.setText("atan");
            btnLog.setText("ln");
        }
        else {
            shift=false;
            btnShift.setForeground(Color.RED);
            btnCos.setForeground(Color.RED);
            btnSin.setForeground(Color.RED);
            btnTan.setForeground(Color.RED);
            btnLog.setForeground(Color.RED);
            btnCos.setText("cos");
            btnSin.setText("sin");
            btnTan.setText("tan");
            btnLog.setText("log");
        }
    }//GEN-LAST:event_btnShiftActionPerformed

    private void btnNegateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegateActionPerformed
        try {
            double ans=equal();
            ans*=-1;
            if ((long)ans==ans)
                txtDisplay.setText((long)ans+"");
            else
                txtDisplay.setText(ans+"");
        }
        catch (Exception e) {
            txtDisplay.setText("Error !");
        }
    }//GEN-LAST:event_btnNegateActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        press('^');
    }//GEN-LAST:event_btnPowerActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtDisplay.setText("0");
        error=false;
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        if (error) {
            txtDisplay.setText("0");                                            //FIXED : added missing semicolon
            error=false;                                                        //FIXED : added missing semicolon   
        }
        else {
            txtDisplay.setText("0");                                            //FIXED : added missing semicolon
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        press('%');
    }//GEN-LAST:event_btnModActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        press('/');
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        if (shift)
            funcCall(LN);
        else
            funcCall(LOG);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed
        press('π');
    }//GEN-LAST:event_btnPiActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        press('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        press('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        press('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProActionPerformed
        press('X');
    }//GEN-LAST:event_btnProActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        if (shift)
            funcCall(ATAN);
        else
            funcCall(TAN);
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactActionPerformed
        // TODO : Prevent UI from freezing without changing the factorial function
        try {
            double ans=equal();
            long num=(long)ans;
            factorial(num);
        } catch (Exception e) {
            txtDisplay.setText("Error !");
        }
    }//GEN-LAST:event_btnFactActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        press('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        press('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        press('-');
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        if (shift)
            funcCall(ACOS);
        else
            funcCall(COS);
    }//GEN-LAST:event_btnCosActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        press('1');
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        press('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        press('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        press('+');
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnOpenParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenParaActionPerformed
        press('(');
    }//GEN-LAST:event_btnOpenParaActionPerformed

    private void btnCloseParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseParaActionPerformed
        press(')');
    }//GEN-LAST:event_btnCloseParaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        press('0');
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        press('.');
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        try {
            double ans=equal();
            if ((long)ans==ans)
                txtDisplay.setText((long)ans+"");
            else
                txtDisplay.setText(ans+"");
        }
        catch (Exception e) {
            txtDisplay.setText("Error !");
        }
    }//GEN-LAST:event_btnEqualActionPerformed

    private void txtDisplayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisplayKeyTyped
        char key= evt.getKeyChar();
        if (key>='0'&&key<='9')
            press(key);
        else if (key=='+'||key=='-'||key=='/'||key=='^'||key=='%'||key=='.')
            press(key);
        else if (key=='*')
            press('X');
        else if (key=='='||key==10) {
            try {
                double ans=equal();
                if ((long)ans==ans)
                    txtDisplay.setText((long)ans+"");
                else
                    txtDisplay.setText(ans+"");
            }
            catch (Exception e) {
                txtDisplay.setText("Error !");
            }
        }
    }//GEN-LAST:event_txtDisplayKeyTyped

    private void btnEqualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEqualMouseEntered
//        try {
//            double ans=equal();
//            if ((long)ans==ans)
//                txtDisplay.setText((long)ans+"");
//            else
//                txtDisplay.setText(ans+"");
//        }
//        catch (Exception e) {
//            txtDisplay.setText("Error !");
//        }
    }//GEN-LAST:event_btnEqualMouseEntered

    /**
     * Evaluates the expression on the display
     * @return
     * @throws Exception 
     */
    private double equal()throws Exception {                                    //FIXED : changed function type from static to non-static
        if (!error) {
            equation=txtDisplay.getText();
            // Handling PI
            int index=-1; 
            index=equation.indexOf('π');
            while (index!=-1) {
                String eqn="";
                eqn=equation.substring(0,index);                                
                if (index!=0)
                    eqn=eqn+"X";
                eqn=eqn+PI;
                if (index<equation.length()-1)
                    eqn=eqn+equation.substring(index+1);
                equation=eqn;
                index=equation.indexOf('π');
            }
            // TODO : Handling negative numbers (eg -20-5 or 20+-5)
            if (true) {
                
            }
            txtDisplay.setText("Calculating..");
            error=true;
        } else {
            txtDisplay.setText("0");
            error=false;
            throw new Exception();
        }
        
        try {
            storeEquation();
            convertPostFix();
            double ans=evaluatePostFix();
            error=false;
            answer=true;
            
            return ans;
        }
        catch (Exception e) {
            error=true;
            throw new Exception();
        }
    }
    
    /**
     * Updates display according to the pressed symbol and other conditions
     * @param symbol 
     */
    private void press(char symbol) {                                           //FIXED : changed function type from static to non-static
        // No error message on the screen
        if (!error) {
            // Value on screen is not an answer (so new symbol will be appended)
            if (!answer) 
                // Value is the place holder zero
                if (txtDisplay.getText().equals("0")) {
                    if ((symbol>='0'&&symbol<='9')||symbol=='('||symbol==')'||symbol=='π')
                        txtDisplay.setText(""+symbol);
                    else
                        txtDisplay.setText(txtDisplay.getText()+symbol);
                }
            
            // Value on screen is an answer (so new symbol will be written or appended)
            else {
                answer=false;
                // Append the symbol 
                if (symbol=='+'||symbol=='-'||symbol=='X'||symbol=='/'||symbol=='%'||symbol=='^') {
                    txtDisplay.setText(txtDisplay.getText()+symbol);
                }
                // Write the symbol
                else {
                    txtDisplay.setText(txtDisplay.getText()+symbol);
                }
            }
        }
        // Error message on screen
        else {
            txtDisplay.setText(symbol+"");
            error=false;
        }
    }
    
    /**
     * Stores the expression in tokenized form 
     * @throws Exception 
     */
    private void storeEquation()throws Exception {                              //FIXED : removed static from function declaration
        expression.add("(");
        int l=equation.length();
        boolean number=false;
        for (int i=0;i<l;i++) {
            char c=equation.charAt(i);
            String tmp="";
            while (Character.isDigit(c)||c=='.') {
                number=true;
                tmp=tmp+c;
                i++;
                if (i<l)
                    c=equation.charAt(i);
                else
                    break;
            }
            if (number&&!(Character.isDigit(c)||c=='.')) {
                i--;
            }
            if (number) {
                try {
                    double a=Double.parseDouble(tmp);
                    tmp=a+"";
                    number=false;
                }
                catch (Exception e) {
                    error=true;
                    throw new Exception(); // No further calculation can be done
                }
            }
            else {
                tmp=c+"";
            }
            expression.add(tmp);
            
        }
        expression.add(")");
    }
    
    /**
     * Converts infix expression to postfix
     */
    private void convertPostFix() {                                             //FIXED : removed static from function declaration
        Stack opstack = new Stack();
        ArrayList<String> output = new ArrayList<>();                           //FIXED : imported array list
        for (int i=0;i<=expression.size();i++) {
            String str = expression.get(i);
            if (str.equals("+")||str.equals("-")||str.equals("X")||str.equals("/")||str.equals("%")||str.equals("^")) {
                // Lowest order
                if (str.equals("+")||str.equals("-")) {
                    // pop all operators
                    String op=(String)opstack.peek();
                    while (!op.equals("(")) {
                        op=(String)opstack.pop();
                        output.add(op);
                        op=(String)opstack.peek();
                    }
                    opstack.push(str);
                }
                // Higher order
                if (str.equals("X")||str.equals("/")||str.equals("%")) {
                    // pop all operators except + -
                    String op=(String)opstack.peek();
                    while (!(op.equals("(")||op.equals("+")||op.equals("-"))) {
                        op=(String)opstack.pop();
                        output.add(op);
                        op=(String)opstack.peek();
                    }
                    opstack.push(str);
                }
                // Highest order
                if (str.equals("^")) {
                    // pop all similar operators
                    String op=(String)opstack.peek();
                    while (!(op.equals("(")||op.equals("+")||op.equals("-")||op.equals("X")||op.equals("/")||op.equals("%"))) {
                        op=(String)opstack.pop();
                        output.add(op);
                        op=(String)opstack.peek();
                    }
                    opstack.push(str);
                }
            }
            else if (str.equals("(")) {
                opstack.push(str);
            }
            else if (str.equals(")")) {
                // pop all elements till openeing para
                String po=(String)opstack.pop();
                while (!po.equals("(")) {
                    output.add(po);
                    po=(String)opstack.pop();
                }
            }
            else {
                // Operand or number
                output.add(str);
            }
        }
        
    }
    
    /**
     * Evaluates postfix expression
     * @return 
     */
    private double evaluatePostFix() {
        Stack operands = new Stack();
        int l=output.size();
        int i;
        for (i=0;i<l;i++) {
            String tmp=output.get(i);
            if (Character.isDigit(tmp.charAt(0))) {
                double n=Double.parseDouble(tmp);
                operands.push(n);
            }
            else {
                double b=(double)operands.pop();
                double a=(double)operands.pop();
                double ans=0;
                char operator = tmp.charAt(0);
                switch (operator) {
                    case '^' :
                        ans=Math.pow(a, b);
                    case 'X' :
                        ans=a*b;
                    case '/' :
                        ans=a/b;
                    case '%' :
                        ans=a%b;
                    case '+' :
                        ans=a+b;
                    case '-' :
                        ans=a-b;
                }
                operands.push(ans);
            }
        }
        return (double)operands.pop();
    }
    
    /**
     * For other mathematical functions
     * @param operation 
     */
    private void funcCall(int operation) {
        try {
            double para=equal();
            double ans=0;
            switch (operation) {
                case SIN:
                    ans = (double) Math.sin(para);
                case ASIN:
                    ans = (double) Math.sin(para);
                case COS:
                    ans = (double) Math.cos(para);
                case ACOS:
                    ans = (double) Math.cos(para);
                case TAN:
                    ans = (double) Math.tan(para);
                case ATAN:
                    ans = (double) Math.tan(para);
            }
            
            if (ans==NaN) {
                error=true;
            }
            if ((long)ans==ans)
                txtDisplay.setText((long)ans+"");
            else
                txtDisplay.setText(ans+"");
        }
        catch (Exception e) {
            txtDisplay.setText("Error !");
        }
    }
    
    /**
     * Returns list of previously evaluated expressions
     * @return 
     */
    private ArrayList<String> showHistory() {
        // TODO : Complete the function
        ArrayList<String> history = new ArrayList<>();
        return history;
    }
    
    
    public static void main(String args[]) {                                    //FIXED : added square brackets for args
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    private String equation;
    private ArrayList<String> expression;   // stores the expression in infix form
    private ArrayList<String> output;       // stores the expression in postfix form
    private boolean answer=false,error=false,shift=false;                       //FIXED :removed final keyword from declaration
    private static final int SIN = 1;
    private static final int COS = 2;
    private static final int TAN = 3;
    private static final int ASIN = 4;
    private static final int ACOS = 5;
    private static final int ATAN = 6;
    private static final int LOG = 7;
    private static final int LN = 8;
    private static final double PI = 22/7;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClosePara;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnNegate;
    private javax.swing.JButton btnOpenPara;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnPro;
    private javax.swing.JButton btnShift;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnTan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
