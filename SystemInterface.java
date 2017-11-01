import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ahsan
 */
public class SystemInterface extends javax.swing.JFrame {
    
    public static TutorGroupCollection tgc = new TutorGroupCollection();
    
    
        // Variables declaration - do not modify                     
    private javax.swing.JTextField TutorEmailUpdateField;
    private javax.swing.JTextField TutorFirstNameUpdateField;
    private javax.swing.JTextField TutorIDField;
    private javax.swing.JTextField TutorIDUpdateField;
    private javax.swing.JTextField TutorLastNameUpdateField;
    private javax.swing.JButton addStudent;
    private javax.swing.JButton addStudentToViewingTable;
    private javax.swing.JButton clearAllFields;
    private javax.swing.JButton clearStudentsViewingTable;
    private javax.swing.JButton createGroupButton;
    private javax.swing.JPanel createTGroupPanel;
    private javax.swing.JButton createTutorGroupPanelViewButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField emailViewField;
    private javax.swing.JTextField fNameViewField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField lNameViewField;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton removeSelectedStudent;
    private javax.swing.JButton removeStudent;
    private javax.swing.JButton setNewTutorViewing;
    private javax.swing.JTextField studentIDViewField;
    private javax.swing.JTextField studentTypeViewField;
    private javax.swing.JTextField tutorEmailField;
    private javax.swing.JTextField tutorFirstNameField;
    private javax.swing.JTextField tutorGroupNameField;
    private javax.swing.JTextField tutorLastNameField;
    private javax.swing.JTextField typeTextField;
    private javax.swing.JButton viewStudents;
    private javax.swing.JPanel viewTGroupPanel;
    private javax.swing.JButton viewTutorGroupsPanelViewButton;
    private javax.swing.JButton viewTutorGroupsRefresh;
    // End of variables declaration 
    
    public SystemInterface() {
        initComponents();
//        addRowToTable();
        createGroupButton.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createTutorGroupPanelViewButton = new javax.swing.JButton();
        viewTutorGroupsPanelViewButton = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        createTGroupPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        typeTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createGroupButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tutorFirstNameField = new javax.swing.JTextField();
        tutorLastNameField = new javax.swing.JTextField();
        tutorEmailField = new javax.swing.JTextField();
        TutorIDField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tutorGroupNameField = new javax.swing.JTextField();
        clearAllFields = new javax.swing.JButton();
        removeSelectedStudent = new javax.swing.JButton();
        viewTGroupPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        viewTutorGroupsRefresh = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        viewStudents = new javax.swing.JButton();
        clearStudentsViewingTable = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fNameViewField = new javax.swing.JTextField();
        lNameViewField = new javax.swing.JTextField();
        emailViewField = new javax.swing.JTextField();
        studentTypeViewField = new javax.swing.JTextField();
        studentIDViewField = new javax.swing.JTextField();
        addStudentToViewingTable = new javax.swing.JButton();
        removeStudent = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TutorFirstNameUpdateField = new javax.swing.JTextField();
        TutorLastNameUpdateField = new javax.swing.JTextField();
        TutorEmailUpdateField = new javax.swing.JTextField();
        TutorIDUpdateField = new javax.swing.JTextField();
        setNewTutorViewing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        createTutorGroupPanelViewButton.setText("Create totor group");
        createTutorGroupPanelViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTutorGroupPanelViewButtonActionPerformed(evt);
            }
        });

        viewTutorGroupsPanelViewButton.setText("View tutor Groups");
        viewTutorGroupsPanelViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTutorGroupsPanelViewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(createTutorGroupPanelViewButton)
                .addGap(96, 96, 96)
                .addComponent(viewTutorGroupsPanelViewButton)
                .addContainerGap(711, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createTutorGroupPanelViewButton)
                    .addComponent(viewTutorGroupsPanelViewButton))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        parentPanel.setBackground(new java.awt.Color(0, 204, 204));
        parentPanel.setLayout(new java.awt.CardLayout());

        createTGroupPanel.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Frist Name", "Last Name", "Email", "Type", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        addStudent.setText("Add Student");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Email");

        jLabel4.setText("Student Type");

        jLabel5.setText("Student ID");

        createGroupButton.setText("Create Tutor Group");
        createGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Tutor First Name");

        jLabel7.setText("Tutor Second Name");

        jLabel8.setText("Tutor Email");

        jLabel9.setText("Tutor ID");

        jLabel10.setText("Tutor Goup Name");

        clearAllFields.setText("Clear");
        clearAllFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllFieldsActionPerformed(evt);
            }
        });

        removeSelectedStudent.setText("Remove Student");
        removeSelectedStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSelectedStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createTGroupPanelLayout = new javax.swing.GroupLayout(createTGroupPanel);
        createTGroupPanel.setLayout(createTGroupPanelLayout);
        createTGroupPanelLayout.setHorizontalGroup(
            createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTGroupPanelLayout.createSequentialGroup()
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE))
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(addStudent)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTGroupPanelLayout.createSequentialGroup()
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(tutorGroupNameField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createTGroupPanelLayout.createSequentialGroup()
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(createTGroupPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tutorFirstNameField)
                            .addComponent(tutorLastNameField)
                            .addComponent(tutorEmailField)
                            .addComponent(TutorIDField))))
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addGap(762, 762, 762)
                        .addComponent(createGroupButton))
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(clearAllFields, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(removeSelectedStudent)))
                .addGap(27, 27, 27))
        );
        createTGroupPanelLayout.setVerticalGroup(
            createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createTGroupPanelLayout.createSequentialGroup()
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createTGroupPanelLayout.createSequentialGroup()
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addStudent)
                            .addComponent(jLabel5))
                        .addGap(145, 145, 145)
                        .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tutorFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tutorLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearAllFields)
                    .addComponent(removeSelectedStudent))
                .addGap(18, 18, 18)
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tutorEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TutorIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createGroupButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(tutorGroupNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );

        parentPanel.add(createTGroupPanel, "card3");

        viewTGroupPanel.setBackground(new java.awt.Color(204, 204, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TutorGroup Name", "Tutor Name", "Tutor Group Type", "Tutor Group Size"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        viewTutorGroupsRefresh.setText("refresh");
        viewTutorGroupsRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTutorGroupsRefreshActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Email", "Student Type", "Student ID"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        viewStudents.setText("View");
        viewStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentsActionPerformed(evt);
            }
        });

        clearStudentsViewingTable.setText("Clear");
        clearStudentsViewingTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearStudentsViewingTableActionPerformed(evt);
            }
        });

        jLabel11.setText("First Name");

        jLabel12.setText("Last Name");

        jLabel13.setText("Email");

        jLabel14.setText("Student Type");

        jLabel15.setText("Student ID");

        addStudentToViewingTable.setText("Add Student");
        addStudentToViewingTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentToViewingTableActionPerformed(evt);
            }
        });

        removeStudent.setText("Remove Student");
        removeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentActionPerformed(evt);
            }
        });

        jLabel16.setText("Tutor First Name");

        jLabel17.setText("Tutor Second Name");

        jLabel18.setText("Tutor Email");

        jLabel19.setText("Tutor ID");

        setNewTutorViewing.setText("Set New Tutor");
        setNewTutorViewing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNewTutorViewingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewTGroupPanelLayout = new javax.swing.GroupLayout(viewTGroupPanel);
        viewTGroupPanel.setLayout(viewTGroupPanelLayout);
        viewTGroupPanelLayout.setHorizontalGroup(
            viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clearStudentsViewingTable)
                            .addComponent(viewStudents)))
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(removeStudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                .addComponent(viewTutorGroupsRefresh)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(21, 21, 21)
                        .addComponent(TutorEmailUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewTGroupPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TutorIDUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TutorFirstNameUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TutorLastNameUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fNameViewField)
                            .addComponent(lNameViewField)
                            .addComponent(emailViewField, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentIDViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentTypeViewField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(addStudentToViewingTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(setNewTutorViewing)))
                .addGap(11, 11, 11))
        );
        viewTGroupPanelLayout.setVerticalGroup(
            viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(viewStudents)
                        .addGap(46, 46, 46)
                        .addComponent(clearStudentsViewingTable)
                        .addGap(28, 28, 28)
                        .addComponent(removeStudent)))
                .addGap(18, 18, 18)
                .addComponent(viewTutorGroupsRefresh)
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(fNameViewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(studentTypeViewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewTGroupPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TutorFirstNameUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lNameViewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(studentIDViewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(emailViewField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addStudentToViewingTable)))
                    .addGroup(viewTGroupPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(TutorLastNameUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(TutorEmailUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(viewTGroupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TutorIDUpdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(setNewTutorViewing)))))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        parentPanel.add(viewTGroupPanel, "card2");

        getContentPane().add(parentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>   



    private void createTutorGroupPanelViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                                
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(createTGroupPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }                                                               

    private void viewTutorGroupsPanelViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(viewTGroupPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        
    }                                                              
    
    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    
    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
//      
        
        if( firstNameTextField.getText().isEmpty() || lastNameTextField.getText().isEmpty() ||
            emailTextField.getText().isEmpty() || typeTextField.getText().isEmpty() || idTextField.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, 
                                         "Enter Values In TextField", "Invalid TextFields", 
                                         JOptionPane.ERROR_MESSAGE);
           return;//return from the method to allow the user to edit the JTextField
        }
        
        else {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[] {this.firstNameTextField.getText(), lastNameTextField.getText(), 
                                    emailTextField.getText(), typeTextField.getText(),idTextField.getText()});
        

        }
        
        if(jTable1.getRowCount() >= 4 && jTable1.getRowCount() <= 8) {
            createGroupButton.setEnabled(true);
        }
        else {
            createGroupButton.setEnabled(false);
        }
    }                                          
    
    
    public void createTutorGroup() {
        
        
        TutorGroup tg  = tgc.createTutorGroup();
        tg.setGroupName(this.tutorGroupNameField.getText());
        tg.addTutor(this.tutorFirstNameField.getText(), this.tutorLastNameField.getText(), this.tutorEmailField.getText(), 
                    Integer.parseInt(this.TutorIDField.getText()));
               
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[] [] tableData = new Object[nRow] [nCol];
        for (int i = 0 ; i < nRow ; i++){
            for (int j = 0 ; j < nCol ; j++){
            tableData[i][j]= dtm.getValueAt(i,j);
            
            }
            tg.addStudent(tableData[i][0].toString(), tableData[i][1].toString(), 
                          tableData[i][2].toString(), tableData[i][3].toString(), 
                          Integer.parseInt(tableData[i][4].toString()));
        }
         
      
    }
          
    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void viewTutorGroupsRefreshActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:

        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        if( tgc.getTutorGroupCollectionSize() == 0 ){
            
            JOptionPane.showMessageDialog(null, 
                                         "No Tutor Groups To View", "Invalid Amount Of Tutor Groups", 
                                         JOptionPane.ERROR_MESSAGE);
           return;//return from the method to allow the user to edit the JTextField
        }
        
        Object rowData[] = new Object[4];


            rowData[0] = tgc.getTutorGroup(tgc.getTutorGroupCollectionSize()-1).getGroupName();
            rowData[1] = tgc.getTutorGroup(tgc.getTutorGroupCollectionSize()-1).getTutor().getFirstName();
            rowData[2] = tgc.getTutorGroup(tgc.getTutorGroupCollectionSize()-1).getGroupType();
            rowData[3] = tgc.getTutorGroup(tgc.getTutorGroupCollectionSize()-1).getGroupSize();
            
            model.addRow(rowData);
            model.fireTableDataChanged();
            jTable2.repaint();
            
        
    }                                                      

    private void createGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        
        if( this.tutorFirstNameField.getText().isEmpty() || this.tutorLastNameField.getText().isEmpty() ||
            this.tutorEmailField.getText().isEmpty() || this.TutorIDField.getText().isEmpty() || this.tutorGroupNameField.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, 
                                         "Enter Values In TextField", "Invalid TextFields", 
                                         JOptionPane.ERROR_MESSAGE);
           return;//return from the method to allow the user to edit the JTextField
        }
        
        
        createTutorGroup();
        
    }                                                 

    private void clearAllFieldsActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        createGroupButton.setEnabled(false);
        this.firstNameTextField.setText("");
        this.lastNameTextField.setText("");
        this.emailTextField.setText("");
        this.idTextField.setText("");
        this.typeTextField.setText("");
        this.tutorFirstNameField.setText("");
        this.tutorLastNameField.setText("");
        this.TutorIDField.setText("");
        this.tutorEmailField.setText("");
        this.tutorGroupNameField.setText("");
        
    }                                              

    private void viewStudentsActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        
        int rowIndex = jTable2.getSelectedRow();
        Object rowData[] = new Object[5];
        
        TutorGroup t = tgc.getTutorGroup(rowIndex);
        
        for (int i = 0; i < t.getGroupSize(); i++) {
            rowData[0] = t.getStudent(i).getFirstName();
            rowData[1] = t.getStudent(i).getLastName();
            rowData[2] = t.getStudent(i).getEmail();
            rowData[3] = t.getStudent(i).getStudentType();
            rowData[4] = t.getStudent(i).getStudentID();
            
            model.addRow(rowData);
        }
        
        if(jTable3.getRowCount() == 8) {
            this.addStudentToViewingTable.setEnabled(false);
        }
        
        else {
                    
            this.addStudentToViewingTable.setEnabled(true);
        }
        
    }                                            

    private void clearStudentsViewingTableActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        
        
    }                                                         

    private void removeStudentActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
	 DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int selRow = jTable3.getSelectedRow();
        
        model.removeRow(selRow);
        
        int tRow = jTable2.getSelectedRow();
        TutorGroup t = tgc.getTutorGroup(tRow);
        Student s = t.getStudent(selRow);
	 t.removeStudent(selRow);
        
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        model2.setValueAt(t.getGroupSize(), tRow, 3);
        
    }                                             

    private void addStudentToViewingTableActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
        
        if( fNameViewField.getText().isEmpty() || lNameViewField.getText().isEmpty() ||
            emailViewField.getText().isEmpty() || studentTypeViewField.getText().isEmpty() || studentIDViewField.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, 
                                         "Enter Values In TextField", "Invalid TextFields", 
                                         JOptionPane.ERROR_MESSAGE);
           return;//return from the method to allow the user to edit the JTextField
        }
        
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        
        int selectedRow = jTable2.getSelectedRow();
        Object rowData[] = new Object[5];
        
        TutorGroup t = tgc.getTutorGroup(selectedRow);
        t.addStudent(this.fNameViewField.getText(), this.lNameViewField.getText(), this.emailViewField.getText(), 
                     this.studentTypeViewField.getText(), Integer.parseInt(this.studentIDViewField.getText()));
        
        
        rowData[0] = this.fNameViewField.getText();
        rowData[1] = this.lNameViewField.getText();
        rowData[2] = this.emailViewField.getText();
        rowData[3] = this.studentTypeViewField.getText();
        rowData[4] = this.studentIDViewField.getText();
        
        model.addRow(rowData);
         
        
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();

        model2.setValueAt(t.getGroupSize(), selectedRow, 3);
        
        
        if(jTable3.getRowCount() == 8) {
            this.addStudentToViewingTable.setEnabled(false);
        }
        
    }                                                        

    private void setNewTutorViewingActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        
        if( this.TutorFirstNameUpdateField.getText().isEmpty() || this.TutorLastNameUpdateField.getText().isEmpty() ||
           this.TutorEmailUpdateField.getText().isEmpty() || this.TutorIDUpdateField.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, 
                                         "Enter Values In TextField", "Invalid TextFields", 
                                         JOptionPane.ERROR_MESSAGE);
           return;//return from the method to allow the user to edit the JTextField
}
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        int selRow = jTable2.getSelectedRow();
        
        TutorGroup t = tgc.getTutorGroup(selRow);
        
        t.addTutor(this.TutorFirstNameUpdateField.getText(), this.TutorLastNameUpdateField.getText(), 
                this.TutorEmailUpdateField.getText(), Integer.parseInt(this.TutorIDUpdateField.getText()));
        
        model.setValueAt(this.TutorFirstNameUpdateField.getText(), selRow, 1);
        
        
    }                                                  

    private void removeSelectedStudentActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selRow = jTable1.getSelectedRow();
        
        model.removeRow(selRow);
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
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
   
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemInterface().setVisible(true);
            }
        });
    }
    
    
    
}
