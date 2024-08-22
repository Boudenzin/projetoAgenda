package br.ufpb.dcx.romildo.agenda.gui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AgendaGUI2Main {
    public static void main(String[] args) {
        JFrame janela2 = new AgendaGUI2();
        janela2.setVisible(true);

        WindowListener fechadorDeJanelaSecundaria = new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }
        };
        janela2.addWindowListener(fechadorDeJanelaSecundaria);

    }
}
