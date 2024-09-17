package com.mycompany.actividad6;

import javax.swing.*;
import java.awt.event.*;

public class CRUDApp extends JFrame {
    private JTextField idField, nameField;
    private JButton createButton, readButton, updateButton, deleteButton;

    public CRUDApp() {
        // Configuración de la ventana
        setTitle("Aplicación CRUD");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Sin layout para posicionar manualmente los componentes
        
        // Etiquetas y campos de texto
        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(50, 50, 50, 30);
        add(idLabel);
        
        idField = new JTextField();
        idField.setBounds(100, 50, 200, 30);
        add(idField);
        
        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(50, 100, 80, 30);
        add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(100, 100, 200, 30);
        add(nameField);
        
        // Botones para las operaciones CRUD
        createButton = new JButton("Crear");
        createButton.setBounds(50, 150, 80, 30);
        add(createButton);
        
        readButton = new JButton("Leer");
        readButton.setBounds(140, 150, 80, 30);
        add(readButton);
        
        updateButton = new JButton("Actualizar");
        updateButton.setBounds(230, 150, 100, 30);
        add(updateButton);
        
        deleteButton = new JButton("Eliminar");
        deleteButton.setBounds(50, 200, 280, 30);
        add(deleteButton);
        
        // Acciones de los botones
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para crear un registro
                createRecord();
            }
        });
        
        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para leer un registro
                readRecord();
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para actualizar un registro
                updateRecord();
            }
        });
        
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar un registro
                deleteRecord();
            }
        });
    }
    
    // Métodos CRUD vacíos que implementaremos
    private void createRecord() {
    // Captura el texto ingresado en los campos
    String id = idField.getText();
    String name = nameField.getText();

    // Verifica que ambos campos no estén vacíos
    if (id.isEmpty() || name.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, llena ambos campos.");
        return; // No continuar si los campos están vacíos
    }
    
    // Llama al método createRecord de FileHandler para guardar el registro en el archivo
    FileHandler.createRecord(id, name);
    
    // Muestra un mensaje de confirmación
    JOptionPane.showMessageDialog(this, "Registro creado: " + id + " - " + name);
    
    // Limpia los campos de texto
    idField.setText("");
    nameField.setText("");
}


    private void readRecord() {
        String id = idField.getText();
        // Lógica para leer el registro
        JOptionPane.showMessageDialog(this, "Leyendo registro con ID: " + id);
    }

    private void updateRecord() {
        String id = idField.getText();
        String name = nameField.getText();
        // Lógica para actualizar el registro
        JOptionPane.showMessageDialog(this, "Registro actualizado: " + id + " - " + name);
    }

    private void deleteRecord() {
        String id = idField.getText();
        // Lógica para eliminar el registro
        JOptionPane.showMessageDialog(this, "Registro eliminado con ID: " + id);
    }
}
