/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hammadashraf2083
 */
public class SGPACAL extends javax.swing.JFrame {

    /**
     * Creates new form SGPACAL
     */
    public SGPACAL() {
        initComponents();
         

    }
 public static boolean o;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sc = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        g1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        c3 = new javax.swing.JComboBox<>();
        m2 = new javax.swing.JTextField();
        b2 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        s6 = new javax.swing.JTextField();
        c2 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        c5 = new javax.swing.JComboBox<>();
        c6 = new javax.swing.JComboBox<>();
        m4 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        m6 = new javax.swing.JTextField();
        b5 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        g2 = new javax.swing.JComboBox<>();
        g3 = new javax.swing.JComboBox<>();
        g4 = new javax.swing.JComboBox<>();
        g5 = new javax.swing.JComboBox<>();
        g6 = new javax.swing.JComboBox<>();
        rollno = new javax.swing.JTextField();
        gpa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));

        l1.setText("SUBJECT_1");

        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel2.setText("SUBJECT");

        jLabel3.setText("C.R");

        jLabel4.setText("MARKS");

        g1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3.66", "3.33", "3.0", "2.66", "2.33", "2.0", "1.5", "0.0" }));

        jLabel5.setText("GRADE");

        b1.setText("HIDE");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        l2.setText("SUBJECT_2");

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));

        b2.setText("HIDE");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l3.setText("SUBJECT_3");

        l4.setText("SUBJECT_4");

        l5.setText("SUBJECT_5");

        l6.setText("SUBJECT_6");

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));

        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4", "3", "2", "1", " " }));

        b5.setText("HIDE");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b3.setText("HIDE");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setText("HIDE");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b6.setText("HIDE");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        jButton7.setText("CALCULATE SPGA");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel11.setText("SEMESTER");

        g2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4\t", "3.66", "3.33", "3", "2.66", "2.33", "2", "1.5", "0" }));

        g3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4\t", "3.66", "3.33", "3", "2.66", "2.33", "2", "1.5", "0" }));

        g4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4\t", "3.66", "3.33", "3", "2.66", "2.33", "2", "1.5", "0" }));

        g5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4\t", "3.66", "3.33", "3", "2.66", "2.33", "2", "1.5", "0" }));

        g6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4\t", "3.66", "3.33", "3", "2.66", "2.33", "2", "1.5", "0" }));

        rollno.setText("ROLLNO");
        rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoActionPerformed(evt);
            }
        });

        gpa.setText("SGPA");
        gpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpaActionPerformed(evt);
            }
        });

        jButton1.setText("CALCULATE_CGPA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l1)
                        .addComponent(l2)
                        .addComponent(l3)
                        .addComponent(l4)
                        .addComponent(l5)
                        .addComponent(l6))
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(35, 35, 35))))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(b5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(b1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(b3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(b4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)))
                        .addComponent(b6)))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b1)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3)
                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4)
                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5)
                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5)
                    .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6)
                    .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6)
                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton7)
                .addGap(45, 45, 45)
                .addComponent(gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DAO dao = new DAO();
        sgpa s = new sgpa();
        
        int e;
        double f;

        double p = 0;
        for (int i = 0; i < 6; i++) {
               
            if (i == 0) {
                s.cr = Integer.parseInt((String) c1.getSelectedItem());

                s.gradepoints = Double.parseDouble((String) g1.getSelectedItem());

                s.marks = Integer.parseInt(m1.getText());
                s.subject = s1.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                s.semester = Integer.parseInt((String) sc.getSelectedItem());

                int a = dao.insertgpa(s);

            } else if (i == 1 && o==true) {
                s.cr = Integer.parseInt((String) c2.getSelectedItem());
                s.gradepoints = Double.parseDouble((String) g2.getSelectedItem());
                s.marks = Integer.parseInt(m2.getText());
                s.subject = s2.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                int a = dao.insertgpa(s);
            } else if (i == 2 && o==true) {
                s.cr = Integer.parseInt((String) c3.getSelectedItem());
                s.gradepoints = Double.parseDouble((String) g3.getSelectedItem());
                s.marks = Integer.parseInt(m3.getText());
                s.subject = s3.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                int a = dao.insertgpa(s);
            } else if (i == 3 && o==true) {
                s.cr = Integer.parseInt((String) c4.getSelectedItem());
                s.gradepoints = Double.parseDouble((String) g4.getSelectedItem());
                s.marks = Integer.parseInt(m4.getText());
                s.subject = s4.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                int a = dao.insertgpa(s);
            } else if (i == 4 && o==true) {
                s.cr = Integer.parseInt((String) c5.getSelectedItem());
                s.gradepoints = Double.parseDouble((String) g5.getSelectedItem());
                s.marks = Integer.parseInt(m5.getText());
                s.subject = s5.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                int a = dao.insertgpa(s);
            } else if (i == 5 && o==true ) {
                
                s.cr = Integer.parseInt((String) c6.getSelectedItem());
                s.gradepoints = Double.parseDouble((String) g6.getSelectedItem());
                s.marks = Integer.parseInt(m6.getText());
                s.subject = s6.getText();
                s.rollno = Integer.parseInt(rollno.getText());
                int a = dao.insertgpa(s);
                System.out.println("INSERTED");

            } else {
                System.out.println("INSERTED");
                
            }
        }

        for (int j = 0; j < 2; j++) {
            if (j == 0) {
                s.rollno = Integer.parseInt(rollno.getText());
                ResultSet rs = dao.sgpaa(s);

                System.out.println(rs);
                try {
                    while (rs.next()) {

                        m1.setText(rs.getString(1) + "");

                    }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            } else if (j == 1) {
                s.rollno = Integer.parseInt(rollno.getText());
                ResultSet rs = dao.grade(s);

                System.out.println(rs);
                try {
                    while (rs.next()) {

                        m2.setText(rs.getDouble(1) + "");
                        e = Integer.parseInt(m1.getText());
                        f = Double.parseDouble(m2.getText());
                        System.out.println(f);
                        double l;
                        l = f / e;

                        gpa.setText("" + l);
                        s.sgpa = Double.parseDouble(gpa.getText());
                        s.rollno = Integer.parseInt(rollno.getText());
                        s.semester = Integer.parseInt((String) sc.getSelectedItem());
                        int k = dao.insertcgpa(s);

                    }
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }

            }

        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

    }//GEN-LAST:event_c1ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void gpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        c6.setVisible(false);
        m6.setVisible(false);
        g6.setVisible(false);
        l6.setVisible(false);
        b6.setVisible(false);
        s6.setVisible(false);
        o=false;
      
       
       


    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        c5.setVisible(false);
        m5.setVisible(false);
        g5.setVisible(false);
        l5.setVisible(false);
        b5.setVisible(false);
        s5.setVisible(false);
          o=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
          c4.setVisible(false);
        m4.setVisible(false);
        g4.setVisible(false);
        l4.setVisible(false);
        b4.setVisible(false);
        s4.setVisible(false);
          o=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        c3.setVisible(false);
        m3.setVisible(false);
        g3.setVisible(false);
        l3.setVisible(false);
        b3.setVisible(false);
        s3.setVisible(false);
          o=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        c2.setVisible(false);
        m2.setVisible(false);
        g2.setVisible(false);
        l2.setVisible(false);
        b2.setVisible(false);
        s2.setVisible(false);
          o=false;
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        c1.setVisible(false);
        m1.setVisible(false);
        g1.setVisible(false);
        l1.setVisible(false);
        b1.setVisible(false);
        s1.setVisible(false);
    }//GEN-LAST:event_b1ActionPerformed

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_rollnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     CGPA obj=new CGPA();
     obj.setVisible(true);
     dispose();
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
            java.util.logging.Logger.getLogger(SGPACAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SGPACAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SGPACAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SGPACAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SGPACAL().setVisible(true);
                //SELECT SUM(gradepoints)*SUM(cr) / SUM(cr) AS TotalItemsOrdered FROM sgpa where rollno=2083;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> g1;
    private javax.swing.JComboBox<String> g2;
    private javax.swing.JComboBox<String> g3;
    private javax.swing.JComboBox<String> g4;
    private javax.swing.JComboBox<String> g5;
    private javax.swing.JComboBox<String> g6;
    private javax.swing.JTextField gpa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField m6;
    private javax.swing.JTextField rollno;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JComboBox<String> sc;
    // End of variables declaration//GEN-END:variables
}
