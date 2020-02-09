package gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class recreacion extends JFrame {

    private final int AnchoVentana = 500;
    private final int AltoVentana = 500;
    Thread hilo;
    boolean inicio = false;
    BufferedImage bi;
    Image img;
    Toolkit h = Toolkit.getDefaultToolkit();
    Graphics2D g2d;
    int Incremento = 0;
    int incx = 50;
    int incy = 50;
    boolean arriba = true;
    boolean abajo = true;
    boolean izquierda = true;
    boolean derecha = true;
    boolean ataca = true;
    boolean ataca_orco = false;
    boolean ataca_elfo = false;
    boolean ataca_enano = false;
    boolean ataca_humano = false;
    String[] posicion = {"null", "null"};
    public static String eleccion;

    public void arriba() {
        abajo = true;
        izquierda = true;
        derecha = true;
        ataca = true;
    }

    public void abajo() {
        arriba = true;
        izquierda = true;
        derecha = true;
        ataca = true;
    }

    public void izquierda() {
        abajo = true;
        arriba = true;
        derecha = true;
        ataca = true;
    }

    public void derecha() {
        abajo = true;
        izquierda = true;
        arriba = true;
        ataca = true;
    }

    public recreacion() {
        setSize(AnchoVentana, AltoVentana);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Recreación");
        bi = new BufferedImage(AnchoVentana, AltoVentana, BufferedImage.TYPE_INT_RGB);
        inicio = true;

        addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    posicion[0] = posicion[1];
                    posicion[1] = "arriba";
                    ataca_orco = false;
                    ataca_humano = false;
                    ataca_elfo = false;
                    ataca_enano = false;
                    img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_arriba.png"));

                    Incremento++;

                    if (Incremento > 4) {
                        Incremento = 0;
                    }
                    if (arriba == true) {
                        incy = incy - 4;
                        if (incy < 20) {
                            incy = incy + 4;
                        }
                    }
                }

                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    posicion[0] = posicion[1];
                    posicion[1] = "abajo";
                    ataca_orco = false;
                    ataca_humano = false;
                    ataca_elfo = false;
                    ataca_enano = false;
                    img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_abajo.png"));

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
                }

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    posicion[0] = posicion[1];
                    posicion[1] = "derecha";
                    ataca_orco = false;
                    ataca_humano = false;
                    ataca_elfo = false;
                    ataca_enano = false;
                    img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_derecha.png"));
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

                }

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    posicion[0] = posicion[1];
                    posicion[1] = "izquierda";
                    ataca_orco = false;
                    ataca_humano = false;
                    ataca_elfo = false;
                    ataca_enano = false;
                    img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_izquierda.png"));
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
                }

                if (e.getKeyCode() == KeyEvent.VK_C) {
                    posicion[0] = posicion[1];

                    if (posicion[1].equals("arriba")) {
                        img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_ataca_arriba.png"));
                    } else if (posicion[1].equals("derecha")) {
                        img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_ataca_derecha.png"));
                    } else if (posicion[1].equals("izquierda")) {
                        img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_ataca_izquierda.png"));
                    } else if (posicion[1].equals("abajo")) {
                        img = h.getImage(this.getClass().getResource("/assets/" + eleccion + "_ataca_abajo.png"));
                    }

                    if (eleccion == "Orco") {
                        ataca_orco = true;
                    }
                    if (eleccion == "Elfo") {
                        ataca_elfo = true;
                    }
                    if (eleccion == "Humano") {
                        ataca_humano = true;
                    }
                    if (eleccion == "Enano") {
                        ataca_enano = true;
                    }
                    Incremento = Incremento + 5;
                    if (Incremento > 5) {
                        Incremento = 0;
                    }
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

        if (ataca_orco == true) {
            if (posicion[0].equals("derecha")) {
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 40, incy - 25, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 52, this);
            } else if (posicion[0].equals("izquierda")) {
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 40, incy - 25, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 52, this);
            } else if (posicion[0].equals("arriba")) {
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 112;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 75, incy - 105, 70 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 112, this);
            } else if (posicion[0].equals("abajo")) {
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 112;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 45, incy - 40, 85 + incx, 120 + incy, mxA, myA, mxA + 112, myA + 112, this);
            }
        } else if (ataca_elfo == true) {
            if (posicion[0].equals("derecha")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("arriba")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("izquierda")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("abajo")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            }
        } else if (ataca_humano == true) {
            if (posicion[0].equals("derecha")) {
                mxA = (Incremento % 6) * 128;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 24, incy - 23, 145 + incx, 50 + incy, mxA, myA, mxA + 128, myA + 52, this);
            }else if(posicion[0].equals("izquierda")){
                mxA = (Incremento % 6) * 128;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 115, incy - 23, 54 + incx, 50 + incy, mxA, myA, mxA + 128, myA + 52, this);
            }else if(posicion[0].equals("abajo")){
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 80;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 50, incy - 35, 90 + incx, 70 + incy, mxA, myA, mxA + 112, myA + 80, this);
            }else if(posicion[0].equals("arriba")){
                mxA = (Incremento % 6) * 112;
                myA = (Incremento / 6) * 80;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 50, incy - 55, 90 + incx, 50 + incy, mxA, myA, mxA + 112, myA + 80, this);
            }
            
        } else if (ataca_enano == true) {
            if (posicion[0].equals("derecha")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("arriba")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("abajo")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 10, incy - 25, 62 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            } else if (posicion[0].equals("izquierda")) {
                mxA = (Incremento % 6) * 64;
                myA = (Incremento / 6) * 52;
                g2d = bi.createGraphics();
                g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
                g2d.drawImage(img, incx - 40, incy - 25, 32 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
            }

        } else {
            mxA = (Incremento % 5) * 64;
            myA = (Incremento / 5) * 52;
            g2d = bi.createGraphics();
            g2d.fillRect(0, 0, AnchoVentana, AltoVentana);
            g2d.drawImage(img, incx - 25, incy - 25, 50 + incx, 50 + incy, mxA, myA, mxA + 64, myA + 52, this);
        }

        repaint();
    }

    public static void inicia() {
        new recreacion().setVisible(true);
    }

}
