/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

//import com.sun.jdi.connect.spi.Connection;
import Conexao.DAO;
import java.awt.Image;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.util.Date;
import Conexao.DAO;
import Utils.Validador;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.text.DateFormat;
import java.sql.ResultSet;
import java.sql.Blob;
import javax.swing.Icon;
/**
 *
 * @author itall
 */
public class Inicio extends javax.swing.JFrame {

    /*Instacia do programa do caba*/
    private FileInputStream fis;
    private int tamanho;//variavel global para armazenar tamanho da imagem. ( em bytes )
    /*Instacia do programa do caba*/
    DAO dao = new DAO();
    private Connection con;
    private PreparedStatement pst;
    private ResultSet rs;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRa = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAdicionar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Sistema Academico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/FotoPadrao.png"))); // NOI18N
        lblFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblFoto.setMaximumSize(new java.awt.Dimension(256, 256));
        lblFoto.setMinimumSize(new java.awt.Dimension(256, 256));
        lblFoto.setPreferredSize(new java.awt.Dimension(256, 256));

        btnCarregar.setForeground(new java.awt.Color(0, 102, 255));
        btnCarregar.setText("Carregar Foto");
        btnCarregar.setFocusPainted(false);
        btnCarregar.setFocusable(false);
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/botao-adicionar.png"))); // NOI18N
        btnAdicionar.setToolTipText("ADICIONAR");
        btnAdicionar.setBorderPainted(false);
        btnAdicionar.setFocusPainted(false);
        btnAdicionar.setMaximumSize(new java.awt.Dimension(64, 64));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(64, 64));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(64, 64));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtNome.setDocument(new Validador(30));

        jLabel2.setText("Digite o Nome:");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/32Vermelho.png"))); // NOI18N
        lblStatus.setToolTipText("STATUS SERVIDOR");
        if (con == null) {
            lblStatus.setToolTipText("SERVIDOR ONLINE");
        } else {
            lblStatus.setToolTipText("SERVIDOR OFFLINE");
        }

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Clear.png"))); // NOI18N
        btnLimpar.setToolTipText("LIMPAR");
        btnLimpar.setBorderPainted(false);
        btnLimpar.setFocusPainted(false);
        btnLimpar.setMaximumSize(new java.awt.Dimension(64, 64));
        btnLimpar.setMinimumSize(new java.awt.Dimension(64, 64));
        btnLimpar.setPreferredSize(new java.awt.Dimension(64, 64));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setText("RA:");

        txtRa.setDocument(new Validador(6));
        txtRa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRaKeyTyped(evt);
            }
        });

        btnBuscar.setForeground(new java.awt.Color(51, 153, 255));
        btnBuscar.setText("Buscar RA");
        btnBuscar.setFocusPainted(false);
        btnBuscar.setFocusable(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAdicionar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Atualizar.png"))); // NOI18N
        btnAdicionar1.setToolTipText("ATUALIZAR");
        btnAdicionar1.setBorderPainted(false);
        btnAdicionar1.setFocusPainted(false);
        btnAdicionar1.setMaximumSize(new java.awt.Dimension(64, 64));
        btnAdicionar1.setMinimumSize(new java.awt.Dimension(64, 64));
        btnAdicionar1.setPreferredSize(new java.awt.Dimension(64, 64));
        btnAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(txtRa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        carregarfoto();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        status();
        SetarData();
    }//GEN-LAST:event_formWindowActivated

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Reset();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscaRA();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtRaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRaKeyTyped
            String caracteres = "0123456789";
            if(!caracteres.contains(evt.getKeyChar() + "")){
                evt.consume();
            }
    }//GEN-LAST:event_txtRaKeyTyped

    private void btnAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionar1ActionPerformed
        Editar();
    }//GEN-LAST:event_btnAdicionar1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private void status(){
        try {
            con = dao.conectar();
            if (con == null) {
                //System.out.println("Erro de Conexão.");
                lblStatus.setIcon(new ImageIcon(Inicio.class.getResource("/Principal/32Vermelho.png")));
            } else {
                //System.out.println("Banco de dados Conectado.");
                lblStatus.setIcon(new ImageIcon(Inicio.class.getResource("/Principal/32Verde.png")));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    private void SetarData(){
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
        lblData.setText(formatador.format(data));
    }
    
    private void carregarfoto(){
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar Arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de Imagens (*.PNG,*.JPG,*.JPEG)","png","jpg","jpeg"));
        int resultado = jfc.showOpenDialog(this);
        if(resultado  == JFileChooser.APPROVE_OPTION){
            try{
                fis = new FileInputStream(jfc.getSelectedFile());
                tamanho = (int) jfc.getSelectedFile().length();
                Image foto = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
                lblFoto.setIcon(new ImageIcon(foto));
                lblFoto.updateUI();
            }catch(Exception e){
                System.out.println(e);
            }
        }          
    }
    
    private void Adicionar(){
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Nome");
            txtNome.requestFocus();
        } else if (fis == null) {
            JOptionPane.showMessageDialog(null, "Por favor, carregue uma foto antes de adicionar.");
        }else{
            String insert = "insert into alunos(nome,foto) values(?,?)";
            try {
                con = dao.conectar();
                pst = con.prepareStatement(insert);
                pst.setString(1, txtNome.getText());
                pst.setBlob(2, fis, tamanho);
                int confirma = pst.executeUpdate();
                if(confirma == 1){
                    JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado com sucesso.");
                    Reset();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar Aluno(a).");
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    private void Editar(){
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o Nome");
            txtNome.requestFocus();
        } else if (fis == null) {
            JOptionPane.showMessageDialog(null, "Por favor, carregue uma foto antes de adicionar.");
        }else{
            String update = "update alunos SET nome = ? ,foto = ? where ra = ?";
            try {
                con = dao.conectar();
                pst = con.prepareStatement(update);
                pst.setString(1, txtNome.getText());
                pst.setBlob(2, fis, tamanho);
                pst.setString(3, txtRa.getText());
                int confirma = pst.executeUpdate();
                if(confirma == 1){
                    JOptionPane.showMessageDialog(null, "Dados do(a) Aluno(a) alterados com sucesso.");
                    Reset();
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao Atualizar dados do(a) Aluno(a).");
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    private void BuscaRA(){
        if(txtRa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o RA.");
            txtRa.requestFocus();
        }else{
            String readRA = "select * from alunos where ra = ?";
            try {
                con = dao.conectar();
                pst = con.prepareStatement(readRA);
                pst.setString(1, txtRa.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    txtNome.setText(rs.getString(2)); // Geta o campo 2 ( que é o Nome na tabela do sql )
                    Blob blob = (Blob) rs.getBlob(3);
                    byte[] img = blob.getBytes(1, (int) blob.length());
                    BufferedImage imagem  = null;
                    try {
                        imagem = ImageIO.read(new ByteArrayInputStream(img));
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ImageIcon icone = new ImageIcon(imagem);
                    Icon foto = new ImageIcon(icone.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH));
                    lblFoto.setIcon(foto);
                } else {
                    JOptionPane.showMessageDialog(null, "Aluno(a) não encontrado.");
                    Reset();
                }
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    private void Reset(){
        txtNome.setText(null);
        txtRa.setText(null);
        lblFoto.setIcon(new ImageIcon(Inicio.class.getResource("/Principal/FotoPadrao.png")));
        fis = null;
        txtNome.requestFocus();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAdicionar1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFoto;
    public static javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRa;
    // End of variables declaration//GEN-END:variables
}
