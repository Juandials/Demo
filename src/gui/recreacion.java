package gui;

import animacion.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class recreacion extends JFrame {

    static Personaje personaje;
    private final int AnchoVentana = 500;
    private final int AltoVentana = 500;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    Image img,fondo;
    Toolkit h = Toolkit.getDefaultToolkit();
    Graphics2D g2d;
    int Incremento = 0;
    int incx = 50;
    int incy = 50;
    boolean arriba = true;
    boolean abajo = true;
    boolean izquierda = true;
    boolean derecha = true;
    boolean ataca = false;
    String[] posicion = {"null", "null"};
    public static String eleccion;
    
    public recreacion() {
        fondo = h.getImage(this.getClass().getResource("/assets/map22x15_claro.png"));
        setSize(AnchoVentana, AltoVentana);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Recreación");
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        inicio = true;

        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                
                switch(e.getKeyCode()){
                    case KeyEvent.VK_UP:
                        posicion[0] = posicion[1];
                        posicion[1] = "arriba";
                        ataca = false;
                        img = h.getImage(this.getClass().getResource(personaje.getArriba()));
                        Incremento++;
                        if (Incremento > 4){
                            Incremento = 0;
                        }
                        if (arriba == true){
                            incy = incy - 4;
                            if (incy < 20){
                                incy = incy + 4;
                            }
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        posicion[0] = posicion[1];
                        posicion[1] = "abajo";
                        ataca = false;
                        img = h.getImage(this.getClass().getResource(personaje.getAbajo()));

                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (abajo == true) {
                            incy = incy + 4;
                            if (incy > getHeight() - 40) {
                                incy = incy - 4;
                            }
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        posicion[0] = posicion[1];
                        posicion[1] = "derecha";
                        ataca = false;
                        img = h.getImage(this.getClass().getResource(personaje.getDerecha()));
                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (derecha == true) {
                            incx = incx + 4;
                            if (incx > getWidth() - 15) {
                                incx = incx - 10;
                            }
                        }
                        break;

                    case KeyEvent.VK_LEFT:
                        posicion[0] = posicion[1];
                        posicion[1] = "izquierda";
                        ataca = false;
                        img = h.getImage(this.getClass().getResource(personaje.getIzquierda()));
                        Incremento++;

                        if (Incremento > 4) {
                            Incremento = 0;
                        }
                        if (izquierda = true) {
                            incx = incx - 4;
                            if (incx < -4) {
                                incx = incx + 4;
                            }
                        }
                        break;
                    case KeyEvent.VK_C:
                        posicion[0] = posicion[1];
                        switch (posicion[1]) {
                            case "arriba":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaArriba()));
                                break;
                            case "abajo":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaAbajo()));
                                break;
                            case "derecha":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaDerecha()));
                                break;
                            case "izquierda":
                                img = h.getImage(this.getClass().getResource(personaje.getAtacaIzquierda()));
                                break;
                        }
                        ataca = true;
                        Incremento = Incremento + 5;
                        if (Incremento > 5) {
                            Incremento = 0;
                        }
                        break;
                }
            }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(bi, 0, 0, null);
        int mxA = (Incremento % 5) * 64;
        int myA = (Incremento / 5) * 52;
        g2d = bi.createGraphics();
        g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
        if (ataca == true){
            switch (eleccion) {
                case "Elfo":
                    switch (posicion[0]) {
                        case "arriba":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "abajo":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "derecha":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "izquierda":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                    }
                    break;
                case "Enano":
                    switch (posicion[0]) {
                        case "derecha":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "arriba":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "abajo":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                        case "izquierda":
                            mxA = (Incremento % 6) * 64;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 40, incy - 25, 32 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
                            break;
                    }
                    break;
                case "Humano":
                    switch (posicion[0]) {
                        case "derecha":
                            mxA = (Incremento % 6) * 128;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 24, incy - 23, 145 + incx, 50 + incy, mxA, myA, mxA + 128, myA + 52, this);
                            break;
                        case "izquierda":
                            mxA = (Incremento % 6) * 128;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 115, incy - 23, 54 + incx, 50 + incy, mxA, myA, mxA + 128, myA + 52, this);
                            break;
                        case "abajo":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 80;
                            g2d.drawImage(img, incx - 50, incy - 35, 90 + incx, 70 + incy, mxA, myA, mxA + 112, myA + 80, this);
                            break;
                        case "arriba":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 80;
                            g2d.drawImage(img, incx - 50, incy - 55, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 80, this);
                            break;
                    }
                    break;
                case "Orco":
                    switch (posicion[0]) {
                        case "derecha":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 40, incy - 25, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 52, this);
                            break;
                        case "izquierda":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 52;
                            g2d.drawImage(img, incx - 40, incy - 25, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 52, this);
                            break;
                        case "arriba":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 112;
                            g2d.drawImage(img, incx - 75, incy - 105, 70 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 112, this);
                            break;
                        case "abajo":
                            mxA = (Incremento % 6) * 112;
                            myA = (Incremento / 6) * 112;
                            g2d.drawImage(img, incx - 45, incy - 40, 85 + incx, 120 + incy, mxA, myA, mxA + 112, myA + 112, this);
                            break;
                    }
                    break;
            }
        } else {
            mxA = (Incremento % 5) * 64;
            myA = (Incremento / 5) * 52;
            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
        }
        repaint();
    }

    public static void inicia() {
        new recreacion().setVisible(true);
        
        Animacion animar = new Animacion();
        switch(eleccion){
            case "Elfo":
                animar.SetPersonajeBuilder(new ElfoBuilder());
                break;
            case "Enano":
                animar.SetPersonajeBuilder(new EnanoBuilder());
                break;
            case "Humano":
                animar.SetPersonajeBuilder(new HumanoBuilder());
                break;
            case "Orco":
                animar.SetPersonajeBuilder(new OrcoBuilder());
                break;
        }
        animar.moverse();
        personaje = animar.getPersonaje();
    }
}