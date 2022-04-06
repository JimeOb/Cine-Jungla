package co.edu.udistrital.cine.presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Vista extends javax.swing.JFrame {

    
    private final Modelo modelo;
    private Controlador control;
    
    
      public Vista(Modelo m) {
      modelo = m;
      initComponents();
      capturarEventos();
      setLocationRelativeTo(null);
      setTitle("Cine Jungla Services");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        return control;
    }
    public JRadioButton getG1() {
        return G1;
    }

    public void setG1(JRadioButton G1) {
        this.G1 = G1;
    }

    public JRadioButton getG10() {
        return G10;
    }

    public void setG10(JRadioButton G10) {
        this.G10 = G10;
    }

    public JRadioButton getG11() {
        return G11;
    }

    public void setG11(JRadioButton G11) {
        this.G11 = G11;
    }

    public JRadioButton getG12() {
        return G12;
    }

    public void setG12(JRadioButton G12) {
        this.G12 = G12;
    }

    public JRadioButton getG13() {
        return G13;
    }

    public void setG13(JRadioButton G13) {
        this.G13 = G13;
    }

    public JRadioButton getG14() {
        return G14;
    }

    public void setG14(JRadioButton G14) {
        this.G14 = G14;
    }

    public JRadioButton getG15() {
        return G15;
    }

    public void setG15(JRadioButton G15) {
        this.G15 = G15;
    }

    public JRadioButton getG16() {
        return G16;
    }

    public void setG16(JRadioButton G16) {
        this.G16 = G16;
    }

    public JRadioButton getG17() {
        return G17;
    }

    public void setG17(JRadioButton G17) {
        this.G17 = G17;
    }

    public JRadioButton getG18() {
        return G18;
    }

    public void setG18(JRadioButton G18) {
        this.G18 = G18;
    }

    public JRadioButton getG19() {
        return G19;
    }

    public void setG19(JRadioButton G19) {
        this.G19 = G19;
    }

    public JRadioButton getG2() {
        return G2;
    }

    public void setG2(JRadioButton G2) {
        this.G2 = G2;
    }

    public JRadioButton getG20() {
        return G20;
    }

    public void setG20(JRadioButton G20) {
        this.G20 = G20;
    }

    public JRadioButton getG21() {
        return G21;
    }

    public void setG21(JRadioButton G21) {
        this.G21 = G21;
    }

    public JRadioButton getG22() {
        return G22;
    }

    public void setG22(JRadioButton G22) {
        this.G22 = G22;
    }

    public JRadioButton getG23() {
        return G23;
    }

    public void setG23(JRadioButton G23) {
        this.G23 = G23;
    }

    public JRadioButton getG24() {
        return G24;
    }

    public void setG24(JRadioButton G24) {
        this.G24 = G24;
    }

    public JRadioButton getG25() {
        return G25;
    }

    public void setG25(JRadioButton G25) {
        this.G25 = G25;
    }

    public JRadioButton getG26() {
        return G26;
    }

    public void setG26(JRadioButton G26) {
        this.G26 = G26;
    }

    public JRadioButton getG27() {
        return G27;
    }

    public void setG27(JRadioButton G27) {
        this.G27 = G27;
    }

    public JRadioButton getG28() {
        return G28;
    }

    public void setG28(JRadioButton G28) {
        this.G28 = G28;
    }

    public JRadioButton getG29() {
        return G29;
    }

    public void setG29(JRadioButton G29) {
        this.G29 = G29;
    }

    public JRadioButton getG3() {
        return G3;
    }

    public void setG3(JRadioButton G3) {
        this.G3 = G3;
    }

    public JRadioButton getG30() {
        return G30;
    }

    public void setG30(JRadioButton G30) {
        this.G30 = G30;
    }

    public JRadioButton getG31() {
        return G31;
    }

    public void setG31(JRadioButton G31) {
        this.G31 = G31;
    }

    public JRadioButton getG32() {
        return G32;
    }

    public void setG32(JRadioButton G32) {
        this.G32 = G32;
    }

    public JRadioButton getG33() {
        return G33;
    }

    public void setG33(JRadioButton G33) {
        this.G33 = G33;
    }

    public JRadioButton getG34() {
        return G34;
    }

    public void setG34(JRadioButton G34) {
        this.G34 = G34;
    }

    public JRadioButton getG35() {
        return G35;
    }

    public void setG35(JRadioButton G35) {
        this.G35 = G35;
    }

    public JRadioButton getG36() {
        return G36;
    }

    public void setG36(JRadioButton G36) {
        this.G36 = G36;
    }

    public JRadioButton getG37() {
        return G37;
    }

    public void setG37(JRadioButton G37) {
        this.G37 = G37;
    }

    public JRadioButton getG38() {
        return G38;
    }

    public void setG38(JRadioButton G38) {
        this.G38 = G38;
    }

    public JRadioButton getG39() {
        return G39;
    }

    public void setG39(JRadioButton G39) {
        this.G39 = G39;
    }

    public JRadioButton getG4() {
        return G4;
    }

    public void setG4(JRadioButton G4) {
        this.G4 = G4;
    }

    public JRadioButton getG40() {
        return G40;
    }

    public void setG40(JRadioButton G40) {
        this.G40 = G40;
    }

    public JRadioButton getG5() {
        return G5;
    }

    public void setG5(JRadioButton G5) {
        this.G5 = G5;
    }

    public JRadioButton getG6() {
        return G6;
    }

    public void setG6(JRadioButton G6) {
        this.G6 = G6;
    }

    public JRadioButton getG7() {
        return G7;
    }

    public void setG7(JRadioButton G7) {
        this.G7 = G7;
    }

    public JRadioButton getG8() {
        return G8;
    }

    public void setG8(JRadioButton G8) {
        this.G8 = G8;
    }

    public JRadioButton getG9() {
        return G9;
    }

    public void setG9(JRadioButton G9) {
        this.G9 = G9;
    }

    public JRadioButton getP1() {
        return P1;
    }

    public void setP1(JRadioButton P1) {
        this.P1 = P1;
    }

    public JRadioButton getP10() {
        return P10;
    }

    public void setP10(JRadioButton P10) {
        this.P10 = P10;
    }

    public JRadioButton getP11() {
        return P11;
    }

    public void setP11(JRadioButton P11) {
        this.P11 = P11;
    }

    public JRadioButton getP12() {
        return P12;
    }

    public void setP12(JRadioButton P12) {
        this.P12 = P12;
    }

    public JRadioButton getP13() {
        return P13;
    }

    public void setP13(JRadioButton P13) {
        this.P13 = P13;
    }

    public JRadioButton getP14() {
        return P14;
    }

    public void setP14(JRadioButton P14) {
        this.P14 = P14;
    }

    public JRadioButton getP15() {
        return P15;
    }

    public void setP15(JRadioButton P15) {
        this.P15 = P15;
    }

    public JRadioButton getP16() {
        return P16;
    }

    public void setP16(JRadioButton P16) {
        this.P16 = P16;
    }

    public JRadioButton getP17() {
        return P17;
    }

    public void setP17(JRadioButton P17) {
        this.P17 = P17;
    }

    public JRadioButton getP18() {
        return P18;
    }

    public void setP18(JRadioButton P18) {
        this.P18 = P18;
    }

    public JRadioButton getP19() {
        return P19;
    }

    public void setP19(JRadioButton P19) {
        this.P19 = P19;
    }

    public JRadioButton getP2() {
        return P2;
    }

    public void setP2(JRadioButton P2) {
        this.P2 = P2;
    }

    public JRadioButton getP20() {
        return P20;
    }

    public void setP20(JRadioButton P20) {
        this.P20 = P20;
    }

    public JRadioButton getP3() {
        return P3;
    }

    public void setP3(JRadioButton P3) {
        this.P3 = P3;
    }

    public JRadioButton getP4() {
        return P4;
    }

    public void setP4(JRadioButton P4) {
        this.P4 = P4;
    }

    public JRadioButton getP5() {
        return P5;
    }

    public void setP5(JRadioButton P5) {
        this.P5 = P5;
    }

    public JRadioButton getP6() {
        return P6;
    }

    public void setP6(JRadioButton P6) {
        this.P6 = P6;
    }

    public JRadioButton getP7() {
        return P7;
    }

    public void setP7(JRadioButton P7) {
        this.P7 = P7;
    }

    public JRadioButton getP8() {
        return P8;
    }

    public void setP8(JRadioButton P8) {
        this.P8 = P8;
    }

    public JRadioButton getP9() {
        return P9;
    }

    public void setP9(JRadioButton P9) {
        this.P9 = P9;
    }

    public JButton getBtnAñadirProductos() {
        return btnAñadirProductos;
    }

    public JButton getBtnCarteleraEmpleado() {
        return btnCarteleraEmpleado;
    }

    public JButton getBtnComprarBoletos() {
        return btnComprarBoletos;
    }

    public JButton getBtnComprarComida() {
        return btnComprarComida;
    }

    public JButton getBtnEliminarPedido() {
        return btnEliminarPedido;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JButton getBtnIniciar1() {
        return btnIniciar1;
    }

    public JButton getBtnIraPagar() {
        return btnIraPagar;
    }

    public JButton getBtnIraPagarComida() {
        return btnIraPagarComida;
    }

    public JButton getBtnRegresaMenu() {
        return btnRegresaMenu;
    }

    public JButton getBtnRegresaMenuEmpleado() {
        return btnRegresaMenuEmpleado;
    }

    public JButton getBtnReportesMultiplex() {
        return btnReportesMultiplex;
    }

    public JButton getBtnReservas() {
        return btnReservas;
    }

    public JButton getBtnVerestado() {
        return btnVerestado;
    }

    public JButton getBtnboletaGratis() {
        return btnboletaGratis;
    }

    public JButton getBtnirSillas() {
        return btnirSillas;
    }

    public JComboBox<String> getCmbFecReserva() {
        return cmbFecReserva;
    }

    public JComboBox<String> getCmbHora() {
        return cmbHora;
    }

    public JComboBox<String> getCmbMultiplex() {
        return cmbMultiplex;
    }

    public JComboBox<String> getCmbSala() {
        return cmbSala;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public JButton getJbPelicula1() {
        return jbPelicula1;
    }

    public JButton getJbPelicula2() {
        return jbPelicula2;
    }

    public JButton getJbPelicula3() {
        return jbPelicula3;
    }

    public JButton getJbPelicula4() {
        return jbPelicula4;
    }

    public JButton getJbPelicula5() {
        return jbPelicula5;
    }

    public JButton getJbPelicula6() {
        return jbPelicula6;
    }

    public JComboBox<String> getJcNombCom() {
        return jcNombCom;
    }

    public JTable getJtConfiteria() {
        return jtConfiteria;
    }

    public JTable getJtEmpleado() {
        return jtEmpleado;
    }

    public JPasswordField getJtxContraseña() {
        return jtxContraseña;
    }

    public JTextField getJtxUsuario() {
        return jtxUsuario;
    }

    public JLabel getLbNomMultiplexEmpleado() {
        return lbNomMultiplexEmpleado;
    }

    public JLabel getLbNombreCliente() {
        return lbNombreCliente;
    }

    public JLabel getLbNommultiplex() {
        return lbNommultiplex;
    }

    public JLabel getLbNompelicula() {
        return lbNompelicula;
    }

    public JLabel getLbNumPuntos() {
        return lbNumPuntos;
    }

    public JLabel getLbPrecioaPagar() {
        return lbPrecioaPagar;
    }

    public JLabel getLbhorFuncion() {
        return lbhorFuncion;
    }

    public JLabel getLbnomPeliculaHorario() {
        return lbnomPeliculaHorario;
    }

    public JLabel getLbnomSala() {
        return lbnomSala;
    }

    public JPanel getPnConfiteria() {
        return pnConfiteria;
    }

    public JPanel getPnDetalle() {
        return pnDetalle;
    }

    public JPanel getPnEmpleadoCarteleraReportes() {
        return pnEmpleadoCarteleraReportes;
    }

    public JPanel getPnEstadoCliente() {
        return pnEstadoCliente;
    }

    public JPanel getPnHorarios() {
        return pnHorarios;
    }

    public JPanel getPnInfo() {
        return pnInfo;
    }

    public JPanel getPnOpcionesCliente() {
        return pnOpcionesCliente;
    }

    public JPanel getPnOpcionesEmpleado() {
        return pnOpcionesEmpleado;
    }

    public JPanel getPnPelicula() {
        return pnPelicula;
    }

    public JPanel getPnPrincipal() {
        return pnPrincipal;
    }

    public JPanel getPnSala() {
        return pnSala;
    }
    
    
     
      
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnInfo = new javax.swing.JPanel();
        pnPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxUsuario = new javax.swing.JTextField();
        jtxContraseña = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        pnOpcionesCliente = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnVerestado = new javax.swing.JButton();
        btnComprarBoletos = new javax.swing.JButton();
        btnComprarComida = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        pnPelicula = new javax.swing.JPanel();
        jbPelicula1 = new javax.swing.JButton();
        jbPelicula3 = new javax.swing.JButton();
        jbPelicula4 = new javax.swing.JButton();
        jbPelicula5 = new javax.swing.JButton();
        jbPelicula6 = new javax.swing.JButton();
        jlTittle = new javax.swing.JLabel();
        jbPelicula2 = new javax.swing.JButton();
        pnSala = new javax.swing.JPanel();
        G20 = new javax.swing.JRadioButton();
        G31 = new javax.swing.JRadioButton();
        G27 = new javax.swing.JRadioButton();
        G25 = new javax.swing.JRadioButton();
        G6 = new javax.swing.JRadioButton();
        G39 = new javax.swing.JRadioButton();
        G23 = new javax.swing.JRadioButton();
        G21 = new javax.swing.JRadioButton();
        G7 = new javax.swing.JRadioButton();
        G40 = new javax.swing.JRadioButton();
        G19 = new javax.swing.JRadioButton();
        G14 = new javax.swing.JRadioButton();
        G37 = new javax.swing.JRadioButton();
        G38 = new javax.swing.JRadioButton();
        G3 = new javax.swing.JRadioButton();
        G13 = new javax.swing.JRadioButton();
        G18 = new javax.swing.JRadioButton();
        G5 = new javax.swing.JRadioButton();
        G36 = new javax.swing.JRadioButton();
        G32 = new javax.swing.JRadioButton();
        G22 = new javax.swing.JRadioButton();
        G26 = new javax.swing.JRadioButton();
        G28 = new javax.swing.JRadioButton();
        G11 = new javax.swing.JRadioButton();
        G35 = new javax.swing.JRadioButton();
        G17 = new javax.swing.JRadioButton();
        G29 = new javax.swing.JRadioButton();
        G15 = new javax.swing.JRadioButton();
        G16 = new javax.swing.JRadioButton();
        G1 = new javax.swing.JRadioButton();
        G33 = new javax.swing.JRadioButton();
        G2 = new javax.swing.JRadioButton();
        G34 = new javax.swing.JRadioButton();
        G30 = new javax.swing.JRadioButton();
        G4 = new javax.swing.JRadioButton();
        G8 = new javax.swing.JRadioButton();
        G12 = new javax.swing.JRadioButton();
        G10 = new javax.swing.JRadioButton();
        G9 = new javax.swing.JRadioButton();
        G24 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        P1 = new javax.swing.JRadioButton();
        P3 = new javax.swing.JRadioButton();
        P2 = new javax.swing.JRadioButton();
        P4 = new javax.swing.JRadioButton();
        P5 = new javax.swing.JRadioButton();
        P6 = new javax.swing.JRadioButton();
        P7 = new javax.swing.JRadioButton();
        P8 = new javax.swing.JRadioButton();
        P9 = new javax.swing.JRadioButton();
        P10 = new javax.swing.JRadioButton();
        P11 = new javax.swing.JRadioButton();
        P12 = new javax.swing.JRadioButton();
        P13 = new javax.swing.JRadioButton();
        P14 = new javax.swing.JRadioButton();
        P16 = new javax.swing.JRadioButton();
        P15 = new javax.swing.JRadioButton();
        P17 = new javax.swing.JRadioButton();
        P18 = new javax.swing.JRadioButton();
        P19 = new javax.swing.JRadioButton();
        P20 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbhorFuncion = new javax.swing.JLabel();
        lbNompelicula = new javax.swing.JLabel();
        lbNommultiplex = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbnomSala = new javax.swing.JLabel();
        btnIniciar1 = new javax.swing.JButton();
        pnHorarios = new javax.swing.JPanel();
        jlTittle1 = new javax.swing.JLabel();
        lbnomPeliculaHorario = new javax.swing.JLabel();
        asdgvaxdsdefs = new javax.swing.JLabel();
        asdfwgvcasfvasf = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        cmbMultiplex = new javax.swing.JComboBox<>();
        asdfwgvcasfvasf1 = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox<>();
        btnirSillas = new javax.swing.JButton();
        asdgvaxdsdefs1 = new javax.swing.JLabel();
        asdfwgvcasfvasf2 = new javax.swing.JLabel();
        cmbFecReserva = new javax.swing.JComboBox<>();
        pnOpcionesEmpleado = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnCarteleraEmpleado = new javax.swing.JButton();
        btnReportesMultiplex = new javax.swing.JButton();
        pnDetalle = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnIraPagar = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbPrecioaPagar = new javax.swing.JLabel();
        asdfwgvcasfvasf4 = new javax.swing.JLabel();
        asdfwgvcasfvasf5 = new javax.swing.JLabel();
        pnEstadoCliente = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        asdfwgvcasfvasf8 = new javax.swing.JLabel();
        lbNumPuntos = new javax.swing.JLabel();
        asdfwgvcasfvasf10 = new javax.swing.JLabel();
        btnboletaGratis = new javax.swing.JButton();
        btnRegresaMenu = new javax.swing.JButton();
        pnEmpleadoCarteleraReportes = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lbNomMultiplexEmpleado = new javax.swing.JLabel();
        asdasdasf = new javax.swing.JLabel();
        btnRegresaMenuEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmpleado = new javax.swing.JTable();
        pnConfiteria = new javax.swing.JPanel();
        jcNombCom = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnAñadirProductos = new javax.swing.JButton();
        btnIraPagarComida = new javax.swing.JButton();
        asdfwgvcasfvasf11 = new javax.swing.JLabel();
        asdfwgvcasfvasf12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConfiteria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfo.setLayout(new java.awt.CardLayout());

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 18, 18));
        jLabel3.setText("Usuario :");
        pnPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 50));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 530, 200));

        jtxUsuario.setBackground(new java.awt.Color(204, 204, 204));
        pnPrincipal.add(jtxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 290, 40));

        jtxContraseña.setBackground(new java.awt.Color(204, 204, 204));
        pnPrincipal.add(jtxContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 290, 40));

        btnIniciar.setBackground(new java.awt.Color(238, 28, 28));
        btnIniciar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar Sesión");
        pnPrincipal.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 180, 40));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 27, 27));
        jLabel6.setText("Contraseña:");
        pnPrincipal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 210, 50));

        pnInfo.add(pnPrincipal, "card6");

        pnOpcionesCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnOpcionesCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnOpcionesCliente.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        btnVerestado.setBackground(new java.awt.Color(238, 28, 28));
        btnVerestado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnVerestado.setText("Ver estado del cliente");
        pnOpcionesCliente.add(btnVerestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 250, 90));

        btnComprarBoletos.setBackground(new java.awt.Color(238, 28, 28));
        btnComprarBoletos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnComprarBoletos.setText("Comprar Boletos");
        pnOpcionesCliente.add(btnComprarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, 90));

        btnComprarComida.setBackground(new java.awt.Color(238, 28, 28));
        btnComprarComida.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnComprarComida.setText("Comprar Comida");
        pnOpcionesCliente.add(btnComprarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 250, 90));

        btnReservas.setBackground(new java.awt.Color(238, 28, 28));
        btnReservas.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnReservas.setText("Reservas");
        pnOpcionesCliente.add(btnReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 250, 90));

        pnInfo.add(pnOpcionesCliente, "card6");

        pnPelicula.setBackground(new java.awt.Color(255, 255, 255));
        pnPelicula.setLayout(null);

        jbPelicula1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara1.jpg"))); // NOI18N
        pnPelicula.add(jbPelicula1);
        jbPelicula1.setBounds(60, 140, 180, 290);

        jbPelicula3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara3.jpg"))); // NOI18N
        pnPelicula.add(jbPelicula3);
        jbPelicula3.setBounds(560, 140, 190, 290);

        jbPelicula4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara4.jpg"))); // NOI18N
        pnPelicula.add(jbPelicula4);
        jbPelicula4.setBounds(50, 460, 190, 300);

        jbPelicula5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara6.jpg"))); // NOI18N
        jbPelicula5.setToolTipText("");
        pnPelicula.add(jbPelicula5);
        jbPelicula5.setBounds(300, 460, 190, 300);

        jbPelicula6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara5.jpg"))); // NOI18N
        pnPelicula.add(jbPelicula6);
        jbPelicula6.setBounds(560, 460, 190, 300);

        jlTittle.setBackground(new java.awt.Color(0, 0, 0));
        jlTittle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTittle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnPelicula.add(jlTittle);
        jlTittle.setBounds(200, 0, 420, 120);

        jbPelicula2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cara2.jpg"))); // NOI18N
        pnPelicula.add(jbPelicula2);
        jbPelicula2.setBounds(300, 140, 190, 290);

        pnInfo.add(pnPelicula, "card2");

        pnSala.setBackground(new java.awt.Color(255, 255, 255));
        pnSala.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnSala.add(G20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 40, 30));
        pnSala.add(G31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 40, 30));
        pnSala.add(G27, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 40, 30));
        pnSala.add(G25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 40, 30));
        pnSala.add(G6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 30));
        pnSala.add(G39, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 40, 30));
        pnSala.add(G23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 40, 30));
        pnSala.add(G21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 40, 30));
        pnSala.add(G7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 40, 30));
        pnSala.add(G40, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 40, 30));
        pnSala.add(G19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 40, 30));
        pnSala.add(G14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, 40, 30));
        pnSala.add(G37, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 40, 30));
        pnSala.add(G38, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 40, 30));
        pnSala.add(G3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 40, 30));
        pnSala.add(G13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 40, 30));
        pnSala.add(G18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 40, 30));
        pnSala.add(G5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 40, 30));
        pnSala.add(G36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 40, 30));
        pnSala.add(G32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 40, 30));
        pnSala.add(G22, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 40, 30));
        pnSala.add(G26, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 40, 30));
        pnSala.add(G28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 40, 30));
        pnSala.add(G11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 40, 30));
        pnSala.add(G35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 40, 30));
        pnSala.add(G17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 40, 30));
        pnSala.add(G29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 40, 30));
        pnSala.add(G15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 40, 30));
        pnSala.add(G16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 40, 30));
        pnSala.add(G1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, 30));
        pnSala.add(G33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 40, 30));
        pnSala.add(G2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 40, 30));
        pnSala.add(G34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 40, 30));
        pnSala.add(G30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 40, 30));
        pnSala.add(G4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 40, 30));
        pnSala.add(G8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 40, 30));
        pnSala.add(G12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 40, 30));
        pnSala.add(G10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 40, 30));
        pnSala.add(G9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 40, 30));
        pnSala.add(G24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 40, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Multiplex:");
        pnSala.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 80, 40));

        P1.setBackground(new java.awt.Color(153, 204, 255));
        P1.setForeground(new java.awt.Color(0, 0, 255));
        pnSala.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 40, 30));

        P3.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 40, 30));

        P2.setBackground(new java.awt.Color(153, 204, 255));
        P2.setForeground(new java.awt.Color(0, 0, 204));
        pnSala.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 40, 30));

        P4.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 40, 30));

        P5.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 40, 30));

        P6.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 40, 30));

        P7.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 40, 30));

        P8.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 40, 30));

        P9.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 40, 30));

        P10.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 40, 30));

        P11.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 40, 30));

        P12.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 40, 30));

        P13.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 40, 30));

        P14.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 40, 30));

        P16.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 40, 30));

        P15.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 40, 30));

        P17.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, 40, 30));

        P18.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 40, 30));

        P19.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 40, 30));

        P20.setBackground(new java.awt.Color(153, 204, 255));
        pnSala.add(P20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 40, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pantalla");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnSala.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 720, 90));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Hora:");
        pnSala.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 40, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Pelicula: ");
        pnSala.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 80, 40));

        lbhorFuncion.setBackground(new java.awt.Color(255, 255, 255));
        lbhorFuncion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbhorFuncion.setText("Nombre pelicula");
        pnSala.add(lbhorFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 320, 20));

        lbNompelicula.setBackground(new java.awt.Color(255, 255, 255));
        lbNompelicula.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbNompelicula.setText("Nombre pelicula");
        pnSala.add(lbNompelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 280, -1));

        lbNommultiplex.setBackground(new java.awt.Color(255, 255, 255));
        lbNommultiplex.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbNommultiplex.setText("Nombre pelicula");
        pnSala.add(lbNommultiplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 320, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("Sala:");
        pnSala.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 40, 40));

        lbnomSala.setBackground(new java.awt.Color(255, 255, 255));
        lbnomSala.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbnomSala.setText("Nombre pelicula");
        pnSala.add(lbnomSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 320, 20));

        btnIniciar1.setBackground(new java.awt.Color(153, 255, 153));
        btnIniciar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnIniciar1.setText("Continuar");
        btnIniciar1.setBorder(null);
        pnSala.add(btnIniciar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 180, 40));

        pnInfo.add(pnSala, "card4");

        pnHorarios.setBackground(new java.awt.Color(255, 255, 255));
        pnHorarios.setLayout(null);

        jlTittle1.setBackground(new java.awt.Color(0, 0, 0));
        jlTittle1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlTittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTittle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnHorarios.add(jlTittle1);
        jlTittle1.setBounds(200, 30, 420, 120);

        lbnomPeliculaHorario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbnomPeliculaHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnomPeliculaHorario.setText("Nombre de la pelicula selecionada");
        pnHorarios.add(lbnomPeliculaHorario);
        lbnomPeliculaHorario.setBounds(110, 190, 590, 40);

        asdgvaxdsdefs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdgvaxdsdefs.setText("Hora:");
        pnHorarios.add(asdgvaxdsdefs);
        asdgvaxdsdefs.setBounds(180, 510, 70, 32);

        asdfwgvcasfvasf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf.setText("Fecha de reserva:");
        pnHorarios.add(asdfwgvcasfvasf);
        asdfwgvcasfvasf.setBounds(180, 290, 190, 40);

        cmbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnHorarios.add(cmbHora);
        cmbHora.setBounds(310, 500, 370, 50);

        cmbMultiplex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnHorarios.add(cmbMultiplex);
        cmbMultiplex.setBounds(310, 360, 370, 50);

        asdfwgvcasfvasf1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf1.setText("Sala:");
        pnHorarios.add(asdfwgvcasfvasf1);
        asdfwgvcasfvasf1.setBounds(180, 430, 70, 40);

        cmbSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnHorarios.add(cmbSala);
        cmbSala.setBounds(310, 430, 370, 50);

        btnirSillas.setBackground(new java.awt.Color(153, 255, 153));
        btnirSillas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnirSillas.setText("Ver asientos disponibles");
        btnirSillas.setBorder(null);
        pnHorarios.add(btnirSillas);
        btnirSillas.setBounds(590, 590, 210, 40);

        asdgvaxdsdefs1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdgvaxdsdefs1.setText("Hora:");
        pnHorarios.add(asdgvaxdsdefs1);
        asdgvaxdsdefs1.setBounds(180, 510, 70, 32);

        asdfwgvcasfvasf2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf2.setText("Multiplex:");
        pnHorarios.add(asdfwgvcasfvasf2);
        asdfwgvcasfvasf2.setBounds(180, 360, 140, 40);

        cmbFecReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnHorarios.add(cmbFecReserva);
        cmbFecReserva.setBounds(370, 300, 310, 30);

        pnInfo.add(pnHorarios, "card2");

        pnOpcionesEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        pnOpcionesEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnOpcionesEmpleado.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        btnCarteleraEmpleado.setBackground(new java.awt.Color(238, 28, 28));
        btnCarteleraEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnCarteleraEmpleado.setText("Ver cartelera del multiplex");
        pnOpcionesEmpleado.add(btnCarteleraEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 250, 90));

        btnReportesMultiplex.setBackground(new java.awt.Color(238, 28, 28));
        btnReportesMultiplex.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnReportesMultiplex.setText("Ver reportes del multiplex");
        pnOpcionesEmpleado.add(btnReportesMultiplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 250, 90));

        pnInfo.add(pnOpcionesEmpleado, "card6");

        pnDetalle.setBackground(new java.awt.Color(255, 255, 255));
        pnDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnDetalle.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        btnIraPagar.setBackground(new java.awt.Color(0, 204, 51));
        btnIraPagar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagar.setText("Pagar");
        pnDetalle.add(btnIraPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, 210, 50));

        btnEliminarPedido.setBackground(new java.awt.Color(238, 28, 28));
        btnEliminarPedido.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnEliminarPedido.setText("Cancelar pedido");
        pnDetalle.add(btnEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 210, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        pnDetalle.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 590, 120));

        lbPrecioaPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPrecioaPagar.setText("MoNtO :3");
        pnDetalle.add(lbPrecioaPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 190, 40));

        asdfwgvcasfvasf4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf4.setText("Detalles del pedido");
        pnDetalle.add(asdfwgvcasfvasf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 290, 40));

        asdfwgvcasfvasf5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf5.setText("TOTAL A PAGAR:");
        pnDetalle.add(asdfwgvcasfvasf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 190, 40));

        pnInfo.add(pnDetalle, "card6");

        pnEstadoCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnEstadoCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnEstadoCliente.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        lbNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNombreCliente.setText("nombre del cliente :v");
        pnEstadoCliente.add(lbNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 550, 40));

        asdfwgvcasfvasf8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf8.setText("Cliente:");
        pnEstadoCliente.add(asdfwgvcasfvasf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 100, 40));

        lbNumPuntos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNumPuntos.setText("1000");
        pnEstadoCliente.add(lbNumPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 80, 40));

        asdfwgvcasfvasf10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf10.setText("Puntos obtenidos: ");
        pnEstadoCliente.add(asdfwgvcasfvasf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 200, 40));

        btnboletaGratis.setBackground(new java.awt.Color(0, 204, 51));
        btnboletaGratis.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnboletaGratis.setText("Obtener boleta gratis!");
        pnEstadoCliente.add(btnboletaGratis, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 210, 50));

        btnRegresaMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenu.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenu.setText("Regresar");
        pnEstadoCliente.add(btnRegresaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 210, 50));

        pnInfo.add(pnEstadoCliente, "card6");

        pnEmpleadoCarteleraReportes.setBackground(new java.awt.Color(255, 255, 255));
        pnEmpleadoCarteleraReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnEmpleadoCarteleraReportes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        lbNomMultiplexEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNomMultiplexEmpleado.setText("1000");
        pnEmpleadoCarteleraReportes.add(lbNomMultiplexEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 310, 40));

        asdasdasf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdasdasf.setText("Multiplex:");
        pnEmpleadoCarteleraReportes.add(asdasdasf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 40));

        btnRegresaMenuEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenuEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenuEmpleado.setText("Regresar");
        pnEmpleadoCarteleraReportes.add(btnRegresaMenuEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 210, 50));

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtEmpleado);

        pnEmpleadoCarteleraReportes.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 730, 160));

        pnInfo.add(pnEmpleadoCarteleraReportes, "card6");

        pnConfiteria.setBackground(new java.awt.Color(255, 255, 255));
        pnConfiteria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcNombCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnConfiteria.add(jcNombCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 330, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pnConfiteria.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 90, 50));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        pnConfiteria.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 380, 120));

        btnAñadirProductos.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirProductos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnAñadirProductos.setText("Añadir al carrito");
        pnConfiteria.add(btnAñadirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 210, 50));

        btnIraPagarComida.setBackground(new java.awt.Color(102, 255, 51));
        btnIraPagarComida.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagarComida.setText("Ir a pagar");
        pnConfiteria.add(btnIraPagarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 210, 50));

        asdfwgvcasfvasf11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf11.setText("Cantidad");
        pnConfiteria.add(asdfwgvcasfvasf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 200, 40));

        asdfwgvcasfvasf12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf12.setText("Item");
        pnConfiteria.add(asdfwgvcasfvasf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 40));

        jtConfiteria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtConfiteria);

        pnConfiteria.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 410, 230));

        pnInfo.add(pnConfiteria, "card11");

        getContentPane().add(pnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton G1;
    private javax.swing.JRadioButton G10;
    private javax.swing.JRadioButton G11;
    private javax.swing.JRadioButton G12;
    private javax.swing.JRadioButton G13;
    private javax.swing.JRadioButton G14;
    private javax.swing.JRadioButton G15;
    private javax.swing.JRadioButton G16;
    private javax.swing.JRadioButton G17;
    private javax.swing.JRadioButton G18;
    private javax.swing.JRadioButton G19;
    private javax.swing.JRadioButton G2;
    private javax.swing.JRadioButton G20;
    private javax.swing.JRadioButton G21;
    private javax.swing.JRadioButton G22;
    private javax.swing.JRadioButton G23;
    private javax.swing.JRadioButton G24;
    private javax.swing.JRadioButton G25;
    private javax.swing.JRadioButton G26;
    private javax.swing.JRadioButton G27;
    private javax.swing.JRadioButton G28;
    private javax.swing.JRadioButton G29;
    private javax.swing.JRadioButton G3;
    private javax.swing.JRadioButton G30;
    private javax.swing.JRadioButton G31;
    private javax.swing.JRadioButton G32;
    private javax.swing.JRadioButton G33;
    private javax.swing.JRadioButton G34;
    private javax.swing.JRadioButton G35;
    private javax.swing.JRadioButton G36;
    private javax.swing.JRadioButton G37;
    private javax.swing.JRadioButton G38;
    private javax.swing.JRadioButton G39;
    private javax.swing.JRadioButton G4;
    private javax.swing.JRadioButton G40;
    private javax.swing.JRadioButton G5;
    private javax.swing.JRadioButton G6;
    private javax.swing.JRadioButton G7;
    private javax.swing.JRadioButton G8;
    private javax.swing.JRadioButton G9;
    private javax.swing.JRadioButton P1;
    private javax.swing.JRadioButton P10;
    private javax.swing.JRadioButton P11;
    private javax.swing.JRadioButton P12;
    private javax.swing.JRadioButton P13;
    private javax.swing.JRadioButton P14;
    private javax.swing.JRadioButton P15;
    private javax.swing.JRadioButton P16;
    private javax.swing.JRadioButton P17;
    private javax.swing.JRadioButton P18;
    private javax.swing.JRadioButton P19;
    private javax.swing.JRadioButton P2;
    private javax.swing.JRadioButton P20;
    private javax.swing.JRadioButton P3;
    private javax.swing.JRadioButton P4;
    private javax.swing.JRadioButton P5;
    private javax.swing.JRadioButton P6;
    private javax.swing.JRadioButton P7;
    private javax.swing.JRadioButton P8;
    private javax.swing.JRadioButton P9;
    private javax.swing.JLabel asdasdasf;
    private javax.swing.JLabel asdfwgvcasfvasf;
    private javax.swing.JLabel asdfwgvcasfvasf1;
    private javax.swing.JLabel asdfwgvcasfvasf10;
    private javax.swing.JLabel asdfwgvcasfvasf11;
    private javax.swing.JLabel asdfwgvcasfvasf12;
    private javax.swing.JLabel asdfwgvcasfvasf2;
    private javax.swing.JLabel asdfwgvcasfvasf4;
    private javax.swing.JLabel asdfwgvcasfvasf5;
    private javax.swing.JLabel asdfwgvcasfvasf8;
    private javax.swing.JLabel asdgvaxdsdefs;
    private javax.swing.JLabel asdgvaxdsdefs1;
    private javax.swing.JButton btnAñadirProductos;
    private javax.swing.JButton btnCarteleraEmpleado;
    private javax.swing.JButton btnComprarBoletos;
    private javax.swing.JButton btnComprarComida;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JButton btnIraPagar;
    private javax.swing.JButton btnIraPagarComida;
    private javax.swing.JButton btnRegresaMenu;
    private javax.swing.JButton btnRegresaMenuEmpleado;
    private javax.swing.JButton btnReportesMultiplex;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnVerestado;
    private javax.swing.JButton btnboletaGratis;
    private javax.swing.JButton btnirSillas;
    private javax.swing.JComboBox<String> cmbFecReserva;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMultiplex;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbPelicula1;
    private javax.swing.JButton jbPelicula2;
    private javax.swing.JButton jbPelicula3;
    private javax.swing.JButton jbPelicula4;
    private javax.swing.JButton jbPelicula5;
    private javax.swing.JButton jbPelicula6;
    private javax.swing.JComboBox<String> jcNombCom;
    private javax.swing.JLabel jlTittle;
    private javax.swing.JLabel jlTittle1;
    private javax.swing.JTable jtConfiteria;
    private javax.swing.JTable jtEmpleado;
    private javax.swing.JPasswordField jtxContraseña;
    private javax.swing.JTextField jtxUsuario;
    private javax.swing.JLabel lbNomMultiplexEmpleado;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbNommultiplex;
    private javax.swing.JLabel lbNompelicula;
    private javax.swing.JLabel lbNumPuntos;
    private javax.swing.JLabel lbPrecioaPagar;
    private javax.swing.JLabel lbhorFuncion;
    private javax.swing.JLabel lbnomPeliculaHorario;
    private javax.swing.JLabel lbnomSala;
    private javax.swing.JPanel pnConfiteria;
    private javax.swing.JPanel pnDetalle;
    private javax.swing.JPanel pnEmpleadoCarteleraReportes;
    private javax.swing.JPanel pnEstadoCliente;
    private javax.swing.JPanel pnHorarios;
    private javax.swing.JPanel pnInfo;
    private javax.swing.JPanel pnOpcionesCliente;
    private javax.swing.JPanel pnOpcionesEmpleado;
    private javax.swing.JPanel pnPelicula;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JPanel pnSala;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
