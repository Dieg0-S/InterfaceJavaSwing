package com.exemplo.interfaceswing;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class InterfaceGraficaSwing extends JFrame {

    public InterfaceGraficaSwing() {
        setTitle("Interface Gráfica com Java Swing");
        setSize(600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 1));

        // a
        JPanel panelA = new JPanel();
        JLabel labelA = new JLabel("Interface gráfica com Java Swing");
        panelA.add(labelA);
        add(panelA);

        // b
        JPanel panelB = new JPanel();
        JLabel labelNome = new JLabel("Nome:");
        JTextField textNome = new JTextField(20);
        panelB.add(labelNome);
        panelB.add(textNome);
        add(panelB);

        // c
        JPanel panelC = new JPanel(new BorderLayout());
        JLabel labelResumo = new JLabel("Faça um resumo de suas atividades profissionais:");
        JTextArea textResumo = new JTextArea(5, 20);
        panelC.add(labelResumo, BorderLayout.WEST);
        panelC.add(new JScrollPane(textResumo), BorderLayout.EAST);
        add(panelC);

        // d
        JPanel panelD = new JPanel();
        JLabel labelCores = new JLabel("Cores preferidas:");
        JCheckBox azul = new JCheckBox("Azul");
        JCheckBox preto = new JCheckBox("Preto");
        JCheckBox amarelo = new JCheckBox("Amarelo");
        JCheckBox verde = new JCheckBox("Verde");
        panelD.add(labelCores);
        panelD.add(azul);
        panelD.add(preto);
        panelD.add(amarelo);
        panelD.add(verde);
        add(panelD);

        // e
        JPanel panelE = new JPanel();
        JLabel labelSexo = new JLabel("Sexo:");
        JRadioButton masculino = new JRadioButton("Masculino");
        JRadioButton feminino = new JRadioButton("Feminino");
        ButtonGroup grupoSexo = new ButtonGroup();
        grupoSexo.add(masculino);
        grupoSexo.add(feminino);
        panelE.add(labelSexo);
        panelE.add(masculino);
        panelE.add(feminino);
        add(panelE);

        // f
        JPanel panelF = new JPanel();
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnSalvar = new JButton("Salvar");
        JButton btnEnviar = new JButton("Enviar");
        panelF.add(btnCancelar);
        panelF.add(btnSalvar);
        panelF.add(btnEnviar);
        add(panelF);

        // g
        JPanel panelG = new JPanel();
        JLabel labelNomeG = new JLabel("Nome:");
        JTextField textNomeG = new JTextField(10);
        JLabel labelSexoG = new JLabel("Sexo:");
        JRadioButton mascG = new JRadioButton("Masculino");
        JRadioButton femG = new JRadioButton("Feminino");
        ButtonGroup grupoSexoG = new ButtonGroup();
        grupoSexoG.add(mascG);
        grupoSexoG.add(femG);
        JButton btnEnviarG = new JButton("Enviar");
        panelG.add(labelNomeG);
        panelG.add(textNomeG);
        panelG.add(labelSexoG);
        panelG.add(mascG);
        panelG.add(femG);
        panelG.add(btnEnviarG);
        add(panelG);

        // h
        JPanel panelH = new JPanel();
        String[] colunas = {"Código", "Produto", "Descrição"};
        Object[][] dados = {
            {"1123", "Pendrive", "Pendrive 32GB"},
            {"2323", "HD SSD", "256 GB"},
            {"3333", "Memória RAM", "16GB"},
            {"2344", "CPU", "i7"}
        };
        JTable tabela = new JTable(dados, colunas);
        JScrollPane scrollPaneTabela = new JScrollPane(tabela);
        panelH.add(scrollPaneTabela);
        add(panelH);

        // i
        JPanel panelI = new JPanel();
        JLabel labelLista = new JLabel("Lista de Nomes:");
        String[] nomes = {"One", "Two", "Three", "Four", "Five"};
        JList<String> lista = new JList<>(nomes);
        JScrollPane scrollPaneLista = new JScrollPane(lista);
        scrollPaneLista.setPreferredSize(new Dimension(100, 80));
        panelI.add(labelLista);
        panelI.add(scrollPaneLista);
        add(panelI);

        // j
        JPanel panelJ = new JPanel();
        JProgressBar barraProgresso = new JProgressBar(0, 100);
        barraProgresso.setValue(43);
        barraProgresso.setStringPainted(true);
        JButton btnCancelarProgresso = new JButton("Cancelar");
        panelJ.add(barraProgresso);
        panelJ.add(btnCancelarProgresso);
        add(panelJ);

        // k
        JPanel panelK = new JPanel();
        JLabel labelArvore = new JLabel("Estrutura de Diretórios:");
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode pasta1 = new DefaultMutableTreeNode("Pasta 1");
        DefaultMutableTreeNode pasta2 = new DefaultMutableTreeNode("Pasta 2");
        DefaultMutableTreeNode arquivo1 = new DefaultMutableTreeNode("Arquivo 1");
        DefaultMutableTreeNode arquivo2 = new DefaultMutableTreeNode("Arquivo 2");
        DefaultMutableTreeNode subPasta1 = new DefaultMutableTreeNode("Subpasta 1");
        DefaultMutableTreeNode subArquivo1 = new DefaultMutableTreeNode("Subarquivo 1");

       
        raiz.add(pasta1);
        raiz.add(pasta2);
        pasta1.add(arquivo1);
        pasta1.add(arquivo2);
        pasta2.add(subPasta1);
        subPasta1.add(subArquivo1);

        JTree arvore = new JTree(raiz);
        JScrollPane scrollPaneArvore = new JScrollPane(arvore);
        scrollPaneArvore.setPreferredSize(new Dimension(150, 150));
        panelK.add(labelArvore);
        panelK.add(scrollPaneArvore);
        add(panelK);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfaceGraficaSwing frame = new InterfaceGraficaSwing();
            frame.setVisible(true);
        });
    }
}
