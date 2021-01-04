
package mt;

//Name: José Adolfo Guadrón Vásquez

//Name of the file: main

//Porpuse: The Turing Machine is designed to check if a string is accepted or rejected base on a specific criteria. The criteria 
//of the string is that only can have '1' and 'A/a'. Also, the '1' should be all before we write an 'A/a'. The string should have more 'A/a' than '1'
//Example of accepted string: 11AA, 11AAAA, 111AaAAA
//Example of rejected string: 111A, 11A1AAA, A1111aA

//Name of the class: Theory of Computation

//Date 3 December 2020
       
import javax.swing.JOptionPane;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public main() {
        initComponents();
    }
String string,stringS,aux;
int state=0; //The states of the TM
int lenght;//The lenght of the string
String array[];//To hold the array with the estring
int index=1;//The position 0 is the blank space
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StringTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(9, 39, 96));
        setForeground(new java.awt.Color(0, 102, 102));
        setSize(new java.awt.Dimension(1000, 1000));

        jPanel1.setBackground(new java.awt.Color(9, 39, 96));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StringTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(StringTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 300, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter a string");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 140, 40));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("S");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 40, 30));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("S");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 40, 30));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("S");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 40, 30));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("S");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 40, 30));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("S");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 40, 30));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("S");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 40, 30));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("S");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 40, 30));

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("S");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 40, 30));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("S");
        jTextField9.setToolTipText("");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 40, 30));

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("S");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 40, 30));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("S");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 40, 30));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("-");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 40, 30));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("-");
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 40, 30));

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("-");
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 40, 30));

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("-");
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 40, 30));

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("-");
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 40, 30));

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("-");
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 30));

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("-");
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 40, 30));

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("-");
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 40, 30));

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("-");
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 40, 30));

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("-");
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 40, 30));

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("-");
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 40, 30));

        jButton1.setBackground(new java.awt.Color(255, 182, 6));
        jButton1.setText("ADD STRING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 182, 6));
        jButton2.setText("NEXT RUN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CURRENT STATE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 51));
        jLabel3.setText("Q0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 80, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TURING MACHINE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel5.setForeground(new java.awt.Color(9, 39, 96));
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //To get the string of the textField
      string =StringTxt.getText();
      //Add the blank space at the begining and at the end of the string to check where it finishes
      stringS="S"+string+"S";
      //Obtain the lenght of the string
      lenght= stringS.length();
      //Create the array with the lenght of the string
      array=new String[lenght];
      //Add the string to its position into the array
      for(int i=0;i<lenght;i++){
          array[i]="" + stringS.charAt(i);
      }
      //Fill the textFields with the S, - and the string
      addStringToTextField();
      
    }//GEN-LAST:event_jButton1ActionPerformed

 //To check in which state the turing is located
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fillTapeHead();
        switch(state){
            case 0:{e0();break;}
            case 1:{e1();break;}
            case 2:{e2();break;}
            case 3:{e3();break;}
            case 4:{e4();break;}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    //To update the string which the changes made during each run
    void updateString(String dato){
        switch(index){
            case 1:{ jTextField2.setText(dato);break;  }
            case 2:{ jTextField3.setText(dato);break;  }
            case 3:{ jTextField4.setText(dato);break;  }
            case 4:{ jTextField5.setText(dato);break;  }
            case 5:{ jTextField6.setText(dato);break;  }           
            case 6:{ jTextField7.setText(dato);break;  }
            case 7:{ jTextField8.setText(dato);break;  }
            case 8:{ jTextField9.setText(dato);break;  }
            case 9:{ jTextField10.setText(dato);break;  }
            case 10:{ jTextField11.setText(dato);break;  }
        }
    }
    
    //To change the position of the tapeHead during each run
    void TapeHead(){
        switch(index){
            case 0:{jTextField12.setText("^"); break; }
            case 1:{jTextField13.setText("^"); break; }
            case 2:{jTextField14.setText("^"); break; }
            case 3:{jTextField15.setText("^"); break; }
            case 4:{jTextField16.setText("^"); break; }
            case 5:{jTextField17.setText("^"); break; }
            case 6:{jTextField18.setText("^"); break; }
            case 7:{jTextField19.setText("^"); break; }
            case 8:{jTextField20.setText("^"); break; }
            case 9:{jTextField21.setText("^"); break; }
            case 10:{jTextField22.setText("^"); break; }
        }
    }
    void moveR(){
        index++;
    }
    void moveL(){
        index--;
    }
    void e0(){
    TapeHead(); 
    //To check the character in the current position
    aux=array[index];
    if(aux.equals("1")){
    //To change the current character to x(the character needed)     
        array[index]="x";
    //Insert into the tape de x    
        updateString("x");
        moveR();
    //Move to the state 1
        state=1;
    }
    else if(aux.equals("B")){
        array[index]="B";
        updateString("B");
        moveR();
        state=3;
    }
    else{
        //Window with rejected message
        JOptionPane.showMessageDialog(rootPane, "REJECTED");
    }
    //Show in which state we are locate
    jLabel3.setText("Q"+state);
}
    void e1(){
        TapeHead();
        aux= array[index];
        if(aux.equals("1")){
            array[index]="1";
            updateString("1");
            moveR();
            state=1;
        }
        else if(aux.equals("B")){
            array[index]="B";
            updateString("B");
            moveR();
            state=1;
        }
        else if(aux.equals("A") || aux.equals("a")){
            array[index]="B";
            updateString("B");
            moveL();
            state=2;
        }
        else{
        
        JOptionPane.showMessageDialog(rootPane, "REJECTED");
    }
      jLabel3.setText("Q"+state);   
    }
    void e2(){
        TapeHead();
        aux= array[index];
        if(aux.equals("1")){
            array[index]="1";
            updateString("1");
            moveL();
            state=2;
        }
        else if(aux.equals("B")){
            array[index]="B";
            updateString("B");
            moveL();
            state=2;
        }
        else if(aux.equals("x")){
            array[index]="1";
            updateString("1");
            moveR();
            state=0;
        }
        else{       
        JOptionPane.showMessageDialog(rootPane, "REJECTED");
        }
         jLabel3.setText("Q"+state);
    }
    void e3(){
        TapeHead();
        aux=array[index];
        if(aux.equals("A")|| aux.equals("a")){
            array[index]="A";
            updateString("A");
            moveR();
           state=3;
        }
        else if(aux.equals("B")){
            array[index]="B";
            updateString("B");
            moveR();
            state=3;
        }
        else if(aux.equals("S")){
            array[index]="S";
            updateString("S");
            moveR();
            state=4;
        }
        else{       
        JOptionPane.showMessageDialog(rootPane, "REJECTED");
        }
         jLabel3.setText("Q"+state);
    }
    void e4(){
        TapeHead();
        JOptionPane.showMessageDialog(rootPane, "ACCEPTED");
         jLabel3.setText("Q"+state);
    }
    
    //Add the inserted string to the textFields
    void addStringToTextField(){
        int position =0;
        while(position <lenght){
            switch(position ){
                case 0:{ jTextField1.setText(array[0]); break;}
                case 1:{ jTextField2.setText(array[1]); break;}
                case 2:{ jTextField3.setText(array[2]); break;}
                case 3:{ jTextField4.setText(array[3]); break;}
                case 4:{ jTextField5.setText(array[4]); break;}
                case 5:{ jTextField6.setText(array[5]); break;}
                case 6:{ jTextField7.setText(array[6]); break;}
                case 7:{ jTextField8.setText(array[7]); break;}
                case 8:{ jTextField9.setText(array[8]); break;}
                case 9:{ jTextField10.setText(array[9]); break;}
                case 10:{ jTextField11.setText(array[10]); break;}
            }
            position ++;
        }
        jTextField12.setText("^");
    }
    
    //To fill the tape where is not the tapeHead
    void fillTapeHead(){
        jTextField12.setText("-");
        jTextField13.setText("-");
        jTextField14.setText("-");
        jTextField15.setText("-");
        jTextField16.setText("-");
        jTextField17.setText("-");
        jTextField18.setText("-");
        jTextField19.setText("-");
        jTextField20.setText("-");
        jTextField21.setText("-");
        jTextField22.setText("-");
    }
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField StringTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
