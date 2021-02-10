
package my.APLICACION_GRAFICA_CALCULADORA_UI;

import java.awt.Frame;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class APLICACION_GRAFICA_CALCULADORA_UI extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    
  
    public APLICACION_GRAFICA_CALCULADORA_UI() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_0 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_coma = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_multiplicacion = new javax.swing.JButton();
        btn_iva = new javax.swing.JButton();
        btn_sin = new javax.swing.JButton();
        btn_sqrt = new javax.swing.JButton();
        btn_potencia = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_punto1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        operacion = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        parenB = new javax.swing.JButton();
        parenA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(415, 670));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(415, 670));
        setResizable(false);
        setSize(new java.awt.Dimension(415, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_0.setBackground(new java.awt.Color(76, 76, 76));
        btn_0.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 427, 100, 100));

        btn_7.setBackground(new java.awt.Color(76, 76, 76));
        btn_7.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 100, 100));

        btn_4.setBackground(new java.awt.Color(76, 76, 76));
        btn_4.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 100, 100));

        btn_1.setBackground(new java.awt.Color(76, 76, 76));
        btn_1.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, 100));

        btn_division.setBackground(new java.awt.Color(76, 76, 76));
        btn_division.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_division.setForeground(new java.awt.Color(255, 255, 255));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON2.jpg"))); // NOI18N
        btn_division.setText("÷");
        btn_division.setBorder(null);
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_division, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 5, 100, 100));

        btn_5.setBackground(new java.awt.Color(76, 76, 76));
        btn_5.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 215, 100, 100));

        btn_9.setBackground(new java.awt.Color(76, 76, 76));
        btn_9.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 100, 100));

        btn_coma.setBackground(new java.awt.Color(76, 76, 76));
        btn_coma.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_coma.setForeground(new java.awt.Color(255, 255, 255));
        btn_coma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_coma.setText(",");
        btn_coma.setBorder(null);
        btn_coma.setFocusPainted(false);
        btn_coma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_coma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_coma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_coma, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 475, 100, 45));

        btn_clear.setBackground(new java.awt.Color(76, 76, 76));
        btn_clear.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_clear.setText("C");
        btn_clear.setBorder(null);
        btn_clear.setFocusPainted(false);
        btn_clear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_clear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 427, 100, 100));

        btn_8.setBackground(new java.awt.Color(76, 76, 76));
        btn_8.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 320, 100, 100));

        btn_6.setBackground(new java.awt.Color(76, 76, 76));
        btn_6.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 215, 100, 100));

        btn_2.setBackground(new java.awt.Color(76, 76, 76));
        btn_2.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 110, 100, 100));

        btn_igual.setBackground(new java.awt.Color(76, 76, 76));
        btn_igual.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON3.jpg"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel1.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 427, 100, 100));

        btn_suma.setBackground(new java.awt.Color(76, 76, 76));
        btn_suma.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON2.jpg"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 320, 100, 100));

        btn_3.setBackground(new java.awt.Color(76, 76, 76));
        btn_3.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 100, 100));

        btn_resta.setBackground(new java.awt.Color(76, 76, 76));
        btn_resta.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON2.jpg"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 215, 100, 100));

        btn_multiplicacion.setBackground(new java.awt.Color(76, 76, 76));
        btn_multiplicacion.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btn_multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON2.jpg"))); // NOI18N
        btn_multiplicacion.setText("x");
        btn_multiplicacion.setBorder(null);
        btn_multiplicacion.setFocusPainted(false);
        btn_multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btn_multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 110, 100, 100));

        btn_iva.setBackground(new java.awt.Color(76, 76, 76));
        btn_iva.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_iva.setForeground(new java.awt.Color(255, 255, 255));
        btn_iva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_iva.setText("IVA");
        btn_iva.setBorder(null);
        btn_iva.setFocusPainted(false);
        btn_iva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_iva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ivaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 55, 100, 50));

        btn_sin.setBackground(new java.awt.Color(76, 76, 76));
        btn_sin.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_sin.setForeground(new java.awt.Color(255, 255, 255));
        btn_sin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_sin.setText("Sin(x)");
        btn_sin.setBorder(null);
        btn_sin.setFocusPainted(false);
        btn_sin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        btn_sqrt.setBackground(new java.awt.Color(76, 76, 76));
        btn_sqrt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_sqrt.setForeground(new java.awt.Color(255, 255, 255));
        btn_sqrt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_sqrt.setText("(n√x) ");
        btn_sqrt.setBorder(null);
        btn_sqrt.setFocusPainted(false);
        btn_sqrt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sqrt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_sqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sqrtActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 100, 50));

        btn_potencia.setBackground(new java.awt.Color(76, 76, 76));
        btn_potencia.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btn_potencia.setForeground(new java.awt.Color(255, 255, 255));
        btn_potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_potencia.setText("(x^n)");
        btn_potencia.setBorder(null);
        btn_potencia.setFocusPainted(false);
        btn_potencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_potencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_potenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 55, 100, 50));

        btn_cos.setBackground(new java.awt.Color(76, 76, 76));
        btn_cos.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(255, 255, 255));
        btn_cos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_cos.setText("Cos(x)");
        btn_cos.setBorder(null);
        btn_cos.setFocusPainted(false);
        btn_cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 0, 100, 50));

        btn_tan.setBackground(new java.awt.Color(76, 76, 76));
        btn_tan.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        btn_tan.setForeground(new java.awt.Color(255, 255, 255));
        btn_tan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON LARGO.jpg"))); // NOI18N
        btn_tan.setText("Tan(x)");
        btn_tan.setBorder(null);
        btn_tan.setFocusPainted(false);
        btn_tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 100, 50));

        btn_punto1.setBackground(new java.awt.Color(76, 76, 76));
        btn_punto1.setFont(new java.awt.Font("SansSerif", 1, 40)); // NOI18N
        btn_punto1.setForeground(new java.awt.Color(255, 255, 255));
        btn_punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        btn_punto1.setText(".");
        btn_punto1.setBorder(null);
        btn_punto1.setFocusPainted(false);
        btn_punto1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        btn_punto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_punto1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 427, 100, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 415, 530));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setBackground(new java.awt.Color(0, 0, 0));
        resultado.setFont(new java.awt.Font("SansSerif", 1, 70)); // NOI18N
        resultado.setForeground(new java.awt.Color(55, 62, 71));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 75, 285, 60));

        operacion.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        operacion.setForeground(new java.awt.Color(102, 102, 102));
        operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel5.add(operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 30, 375, 45));

        mini.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 153, 0));
        mini.setText("•");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });
        jPanel5.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, 30, 30));

        cerrar.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 51, 51));
        cerrar.setText("•");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel5.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        parenB.setBackground(new java.awt.Color(255, 255, 255));
        parenB.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        parenB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        parenB.setText(")");
        parenB.setBorder(null);
        parenB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parenB.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        parenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenBActionPerformed(evt);
            }
        });
        jPanel5.add(parenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 105, 40, 40));

        parenA.setBackground(new java.awt.Color(255, 255, 255));
        parenA.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        parenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTONBRILLANTE.jpg"))); // NOI18N
        parenA.setText("(");
        parenA.setBorder(null);
        parenA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parenA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BOTON1.jpg"))); // NOI18N
        parenA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parenAActionPerformed(evt);
            }
        });
        jPanel5.add(parenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 40, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 415, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // BOTON 2
        escribirNumero("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicacionActionPerformed
        // MULTIPLICACION
        escribirNumero("*");
    }//GEN-LAST:event_btn_multiplicacionActionPerformed

    private void btn_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ivaActionPerformed
        // IVA
        escribirNumero("*0.19");
    }//GEN-LAST:event_btn_ivaActionPerformed

    private void btn_sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinActionPerformed
        // SENO
        escribirNumero("sin(");
       
    }//GEN-LAST:event_btn_sinActionPerformed

    private void btn_sqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sqrtActionPerformed
        // RAIZ ENESIMA
        escribirNumero("√");
    }//GEN-LAST:event_btn_sqrtActionPerformed

    private void btn_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_potenciaActionPerformed
        // POTENCIA ENESIMA
        escribirNumero("^");
    }//GEN-LAST:event_btn_potenciaActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
        // COSENO
        escribirNumero("cos(");
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
        // TANGENTE
        escribirNumero("tan(");
    }//GEN-LAST:event_btn_tanActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // BOTON C CLEAR:
        resultado.setText("");
        operacion.setText("");
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed
        // DIVISION
        escribirNumero("/");
    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        // RESTA
        escribirNumero("-");
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        // SUMA
        escribirNumero("+");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // IGUAL
        
        try{
            String conversor = CONVERSOR_OPERACIONES(operacion.getText());
            
          String resultado2 = se.eval(conversor).toString();
          
            System.out.println(conversor);
            System.out.println(resultado2);
            
          resultado.setText(resultado2);
          
        }catch(Exception e){
            operacion.setText("ERROR");
        }   
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_comaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comaActionPerformed
        // COMA
        escribirNumero(",");
    }//GEN-LAST:event_btn_comaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // CERO 0
        escribirNumero("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // NUEVE 9
        escribirNumero("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // OCHO 8
        escribirNumero("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // SIETE 7
        escribirNumero("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // SEIS 6
        escribirNumero("6");
        
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // CINCO 5
        escribirNumero("5");    
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        escribirNumero("4");   
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TRES 3
        escribirNumero("3");   
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // UNO 1
        escribirNumero("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void parenAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenAActionPerformed
       //PARENTESIS
        escribirNumero("(");
    }//GEN-LAST:event_parenAActionPerformed

    private void parenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parenBActionPerformed
        //PARENTESIS
        escribirNumero(")");
        
    }//GEN-LAST:event_parenBActionPerformed

    private void btn_punto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_punto1ActionPerformed
        // PUNTO
        escribirNumero(".");
    }//GEN-LAST:event_btn_punto1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(APLICACION_GRAFICA_CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APLICACION_GRAFICA_CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APLICACION_GRAFICA_CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APLICACION_GRAFICA_CALCULADORA_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APLICACION_GRAFICA_CALCULADORA_UI().setVisible(true);
            }
        });
        }
    
    
    //ESCRIBIR LOS NUMEROS CUANDO SE PRESIONA EL BOTON
    public void escribirNumero(String digito){
        operacion.setText(operacion.getText()+digito);
    }
    
    //CAMBIAR DE ASPECTO VISUAL A OPERACION INTERNA
    public  String CONVERSOR_OPERACIONES(String Operacion){
        
        String nuevaOp = "";
        String caracter = "";
        
        String antes = "";
        String despues = "";
        
        String auxiliar1 = "";
        String auxiliar2 = "";
        
        int posicionParentesisAbierto = 0;
        int posicionParentesisCerrado = 0;
        int posicionPrueba = 0;
        int contadorPa = 0;
        
        nuevaOp = Operacion.replace("sin(", "Math.sin((Math.PI/180)*");
        
        nuevaOp = nuevaOp.replace("cos(", "Math.cos((Math.PI/180)*");
        
        nuevaOp = nuevaOp.replace("tan(", "Math.tan((Math.PI/180)*");
        
      
        for(int x = 0; x < Operacion.length(); x++){
           
            
                caracter= Operacion.substring(x,x+1);
                
                
                if(caracter.compareTo("(") == 0){
                    posicionPrueba = x;
                }
                
                
                if(caracter.compareTo("^") == 0 ){
                    
                    if(posicionPrueba < x){
                        
                        posicionParentesisAbierto = posicionPrueba;
                        
                    }

                    nuevaOp = nuevaOp.replace("^", ",");
                    
                    antes = nuevaOp.substring(0, posicionParentesisAbierto);
                    despues = nuevaOp.substring(posicionParentesisAbierto+1, nuevaOp.length());
                    
                    nuevaOp = antes + "Math.pow(" + despues;
                  
     
                }
               
               if(caracter.compareTo("√")==0){
                   
                   if(posicionPrueba < x){
                        
                        posicionParentesisAbierto = posicionPrueba;
                        
                    }
                 
                    
                    for(int y = x; y<nuevaOp.length(); y++){
                        caracter= nuevaOp.substring(y,y+1);
                        
                        if(caracter.compareTo(")")==0){
                            contadorPa++;
                            
                            if(contadorPa == 1){
                                posicionParentesisCerrado = y;
                            }
                            
                        }
                    }
                    
                    antes = nuevaOp.substring(0, posicionParentesisAbierto);
                    
                    auxiliar2 = nuevaOp.substring(x+1, posicionParentesisCerrado);
                    
                    auxiliar1 = nuevaOp.substring(posicionParentesisAbierto+1, x);
                   
                    
                    despues = nuevaOp.substring(posicionParentesisCerrado, nuevaOp.length());
                    
                    
                    nuevaOp= antes + "Math.pow(" + auxiliar2 + ", 1/" + auxiliar1  + despues;
                    
                }    
                
           }  
        
        return nuevaOp;
                 
    }
    
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_coma;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_iva;
    private javax.swing.JButton btn_multiplicacion;
    private javax.swing.JButton btn_potencia;
    private javax.swing.JButton btn_punto1;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_sqrt;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tan;
    private javax.swing.JLabel cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel operacion;
    private javax.swing.JButton parenA;
    private javax.swing.JButton parenB;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
