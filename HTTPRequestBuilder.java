/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//To run in command line, disable the package setting
//package me.binglu.HTTPRequestBuilder;
 

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Bing Lu
 */
public class HTTPRequestBuilder extends javax.swing.JFrame {

    String method = "GET";
    String host = "www.google.ca";
    String protocol = "HTTP/1.1";
    String internalPath = "/";
    String connectionType = "keep-alive";
    String userAgent = "Mozilla/5.0";
    String accept = "text/html,image/jpeg";
    int port = 80;

    
    /**
     * Creates new form HTTPRequestBuilder
     */
    public HTTPRequestBuilder() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaStatus = new javax.swing.JTextArea();
        jLableStatus = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelMethod = new javax.swing.JLabel();
        jLabelProtocol = new javax.swing.JLabel();
        jLabelInternalpath = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldAccept = new javax.swing.JTextField();
        jComboBoxConnection = new javax.swing.JComboBox();
        jComboBoxUserAgent = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jComboBoxMethod = new javax.swing.JComboBox();
        jTextFieldInternalPath = new javax.swing.JTextField();
        jComboBoxProtocol = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabelPort = new javax.swing.JLabel();
        jLabelHost = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldPort = new javax.swing.JTextField();
        jTextFieldHost = new javax.swing.JTextField();
        jLabelHttp = new javax.swing.JLabel();
        jButtonSend = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabelUserAgent = new javax.swing.JLabel();
        jLabelConnection = new javax.swing.JLabel();
        jLabelAccept = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HTTP Request Builder");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaStatus.setEditable(false);
        jTextAreaStatus.setColumns(20);
        jTextAreaStatus.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaStatus.setRows(5);
        jTextAreaStatus.setText("===================================================\n***********   HTTP Request Builder    *************\n===================================================");
        jScrollPane1.setViewportView(jTextAreaStatus);

        jLableStatus.setText("Status Messages");

        jLabelMethod.setText("Method");

        jLabelProtocol.setText("Protocol");

        jLabelInternalpath.setText("Internal Path");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelMethod)
                .addGap(107, 107, 107)
                .addComponent(jLabelInternalpath)
                .addGap(125, 125, 125)
                .addComponent(jLabelProtocol)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMethod)
                    .addComponent(jLabelProtocol)
                    .addComponent(jLabelInternalpath))
                .addContainerGap())
        );

        jTextFieldAccept.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextFieldAccept.setForeground(java.awt.Color.gray);
        jTextFieldAccept.setText("text/html,image/jpeg");
        jTextFieldAccept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAcceptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldAcceptFocusLost(evt);
            }
        });

        jComboBoxConnection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "keep-alive", "close" }));
        jComboBoxConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConnectionActionPerformed(evt);
            }
        });

        jComboBoxUserAgent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mozilla/5.0", "Chrome/32", "Safari/537.36" }));
        jComboBoxUserAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUserAgentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jComboBoxConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxUserAgent, 0, 134, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAccept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxUserAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBoxMethod.setEditable(true);
        jComboBoxMethod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GET", "HEAD" }));
        jComboBoxMethod.setToolTipText("HTTP method");
        jComboBoxMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMethodActionPerformed(evt);
            }
        });

        jTextFieldInternalPath.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jTextFieldInternalPath.setForeground(java.awt.Color.gray);
        jTextFieldInternalPath.setText("/");
        jTextFieldInternalPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInternalPathActionPerformed(evt);
            }
        });
        jTextFieldInternalPath.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldInternalPathFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldInternalPathFocusLost(evt);
            }
        });

        jComboBoxProtocol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HTTP 1.1", "HTTP 1.0" }));
        jComboBoxProtocol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProtocolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jComboBoxMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldInternalPath, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxProtocol, 0, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldInternalPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jComboBoxProtocol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelPort.setText("Port");

        jLabelHost.setText("Host");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHost)
                .addGap(203, 203, 203)
                .addComponent(jLabelPort)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHost)
                    .addComponent(jLabelPort)))
        );

        jTextFieldPort.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextFieldPort.setForeground(java.awt.Color.gray);
        jTextFieldPort.setText("80");
        jTextFieldPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldPortFocusLost(evt);
            }
        });

        jTextFieldHost.setFont(new java.awt.Font("Monospaced", 2, 15)); // NOI18N
        jTextFieldHost.setForeground(java.awt.Color.gray);
        jTextFieldHost.setText("www.google.ca");
        jTextFieldHost.setToolTipText("The URL of your request's destination");
        jTextFieldHost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldHostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldHostFocusLost(evt);
            }
        });

        jLabelHttp.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabelHttp.setText("http://");

        jButtonSend.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonSend.setText("Send");
        jButtonSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelHttp)
                .addGap(1, 1, 1)
                .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSend, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelHttp)
                .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtonSend))
        );

        jLabelUserAgent.setText("User-Agent");

        jLabelConnection.setText("Connection");

        jLabelAccept.setText("Accept");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConnection)
                .addGap(115, 115, 115)
                .addComponent(jLabelAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jLabelUserAgent)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserAgent)
                    .addComponent(jLabelConnection)
                    .addComponent(jLabelAccept))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLableStatus)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLableStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInternalPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInternalPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInternalPathActionPerformed

    private void jTextFieldHostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHostFocusLost
        // TODO add your handling code here:
        if(this.jTextFieldHost.getText().length() == 0){
            jTextFieldHost.setText("www.google.ca");
            host = "www.google.ca";
            jTextFieldHost.setFont(new java.awt.Font("Monospaced", 2, 15)); // NOI18N
            jTextFieldHost.setForeground(java.awt.Color.GRAY);
        }
        else{
            host = (String) jTextFieldHost.getText();
        }
    }//GEN-LAST:event_jTextFieldHostFocusLost

    private void jTextFieldHostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldHostFocusGained
        // TODO add your handling code here:
        jTextFieldHost.setText("");
        jTextFieldHost.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextFieldHost.setForeground(java.awt.Color.BLACK);
    }//GEN-LAST:event_jTextFieldHostFocusGained

    private void jComboBoxProtocolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProtocolActionPerformed
        // TODO add your handling code here:
        this.protocol = (String) jComboBoxProtocol.getSelectedItem();
    }//GEN-LAST:event_jComboBoxProtocolActionPerformed

    private void jComboBoxMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMethodActionPerformed
        // TODO add your handling code here:
        this.method = (String) jComboBoxMethod.getSelectedItem();
    }//GEN-LAST:event_jComboBoxMethodActionPerformed

    private void jButtonSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSendMouseClicked
        // TODO add your handling code here:

        Socket socket = null;
        PrintWriter printWriter = null;
        BufferedReader bufReader = null;
        try{
            
            //create socket
            socket = new Socket(host, port);

            //create http request
            printWriter = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            printWriter.println(method+" "+internalPath+" "+protocol);
            printWriter.println("Host: " + host);
            printWriter.println("Accept: "+accept);
            printWriter.println("User-Agent: "+userAgent); 
            printWriter.println("Connection: "+connectionType);
            printWriter.println("");
            printWriter.println(""); // Important, else the server will expect that there's more into the request.
            printWriter.flush();
            
            //output the created http request to status text area
            this.jTextAreaStatus.append("\r\nThe sent HTTP request was: \r\n");
            this.jTextAreaStatus.append("-------------------------------------------------\r\n");
            this.jTextAreaStatus.append(method+" "+internalPath+" "+protocol+"\r\n");
            this.jTextAreaStatus.append("Host: " + host+"\r\n");
            this.jTextAreaStatus.append("Accept: "+accept+"\r\n");
            this.jTextAreaStatus.append("User-Agent: "+userAgent+"\r\n");
            this.jTextAreaStatus.append("Connection: "+connectionType+"\r\n");
            
            //store the response head
            bufReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            for (String line; (line = bufReader.readLine()) != null;) {
                if (line.isEmpty()) 
                    break; // Stop when headers are completed. We're not interested in all the HTML.
                sb.append(line);
                sb.append("\r\n");
            }
            
            //output response head to status text area
            this.jTextAreaStatus.append("\r\n\r\nThe received HTTP response header was: \r\n");
            this.jTextAreaStatus.append("----------------------------------------------------------------\r\n");
            this.jTextAreaStatus.append(sb.toString());

        }catch(Exception ex){
            this.jTextAreaStatus.append(ex.getMessage());
            System.out.println(ex.getMessage());
        }
        finally{
            if (bufReader != null) try { bufReader.close(); } catch (IOException ioe) {} 
            if (printWriter != null) { printWriter.close(); }
            if (socket != null) try { socket.close(); } catch (IOException ioe) {} 
        }
        
    }//GEN-LAST:event_jButtonSendMouseClicked

    private void jTextFieldInternalPathFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldInternalPathFocusGained
        // TODO add your handling code here:
        jTextFieldInternalPath.setText("");
        jTextFieldInternalPath.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextFieldInternalPath.setForeground(java.awt.Color.BLACK);
    }//GEN-LAST:event_jTextFieldInternalPathFocusGained

    private void jTextFieldInternalPathFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldInternalPathFocusLost
        // TODO add your handling code here:
        if(this.jTextFieldInternalPath.getText().length() == 0){
            jTextFieldInternalPath.setText("/");
            internalPath = "/";
            jTextFieldInternalPath.setFont(new java.awt.Font("Monospaced", 2, 15)); // NOI18N
            jTextFieldInternalPath.setForeground(java.awt.Color.GRAY);
        }
        else{
            internalPath = (String) jTextFieldInternalPath.getText();
        }
    }//GEN-LAST:event_jTextFieldInternalPathFocusLost

    private void jComboBoxConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConnectionActionPerformed
        // TODO add your handling code here:
        this.connectionType = (String) jComboBoxConnection.getSelectedItem();
    }//GEN-LAST:event_jComboBoxConnectionActionPerformed

    private void jComboBoxUserAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUserAgentActionPerformed
        // TODO add your handling code here:
        this.userAgent = (String) jComboBoxUserAgent.getSelectedItem();
    }//GEN-LAST:event_jComboBoxUserAgentActionPerformed

    private void jTextFieldAcceptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAcceptFocusGained
        // TODO add your handling code here:
        jTextFieldAccept.setText("");
        jTextFieldAccept.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextFieldAccept.setForeground(java.awt.Color.BLACK);
    }//GEN-LAST:event_jTextFieldAcceptFocusGained

    private void jTextFieldAcceptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAcceptFocusLost
        // TODO add your handling code here:
        if(this.jTextFieldAccept.getText().length() == 0){
            jTextFieldAccept.setText("text/html,image/jpeg");
            accept = "text/html,image/jpeg";
            jTextFieldAccept.setFont(new java.awt.Font("Monospaced", 2, 15)); // NOI18N
            jTextFieldAccept.setForeground(java.awt.Color.GRAY);
        }
        else{
            accept = (String) jTextFieldAccept.getText();
        }        
    }//GEN-LAST:event_jTextFieldAcceptFocusLost

    private void jTextFieldPortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPortFocusGained
        // TODO add your handling code here:
        jTextFieldPort.setText("");
        jTextFieldPort.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        jTextFieldPort.setForeground(java.awt.Color.BLACK);        
    }//GEN-LAST:event_jTextFieldPortFocusGained

    private void jTextFieldPortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPortFocusLost
        // TODO add your handling code here:
        if(this.jTextFieldPort.getText().length() == 0){
            jTextFieldPort.setText("80");
            port = 80;
            jTextFieldPort.setFont(new java.awt.Font("Monospaced", 2, 15)); // NOI18N
            jTextFieldPort.setForeground(java.awt.Color.GRAY);
        }
        else{
            port = Integer.parseInt((String) jTextFieldPort.getText());
        } 
    }//GEN-LAST:event_jTextFieldPortFocusLost

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
            java.util.logging.Logger.getLogger(HTTPRequestBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HTTPRequestBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HTTPRequestBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HTTPRequestBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HTTPRequestBuilder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSend;
    private javax.swing.JComboBox jComboBoxConnection;
    private javax.swing.JComboBox jComboBoxMethod;
    private javax.swing.JComboBox jComboBoxProtocol;
    private javax.swing.JComboBox jComboBoxUserAgent;
    private javax.swing.JLabel jLabelAccept;
    private javax.swing.JLabel jLabelConnection;
    private javax.swing.JLabel jLabelHost;
    private javax.swing.JLabel jLabelHttp;
    private javax.swing.JLabel jLabelInternalpath;
    private javax.swing.JLabel jLabelMethod;
    private javax.swing.JLabel jLabelPort;
    private javax.swing.JLabel jLabelProtocol;
    private javax.swing.JLabel jLabelUserAgent;
    private javax.swing.JLabel jLableStatus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaStatus;
    private javax.swing.JTextField jTextFieldAccept;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldInternalPath;
    private javax.swing.JTextField jTextFieldPort;
    // End of variables declaration//GEN-END:variables
}