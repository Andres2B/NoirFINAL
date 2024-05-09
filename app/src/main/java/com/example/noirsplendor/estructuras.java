package com.example.noirsplendor;

public class estructuras {

    // Interfaz para prendas elegantes
    interface PrendaElegante {
        void mostrarDetalle();
    }

    // Clase base Prenda
    public class Prenda implements PrendaElegante {
        protected String tipo;
        protected double precio;

        public Prenda(String tipo, double precio) {
            this.tipo = tipo;
            this.precio = precio;
        }

        @Override
        public void mostrarDetalle() {
            System.out.println("Tipo: " + tipo);
            System.out.println("Precio: $" + precio);
        }
    }

    // Clase derivada Camisa
    public static class Camisa {
        private String talla;

        public Camisa(String talla, double precio) {
            super();
            this.talla = talla;
        }

        public Camisa(String talla, double precio, String marca) {
            super();
            this.talla = talla;
            System.out.println("Marca: " + marca);
        }

    }

    // Clase derivada Pantalón
    public class Pantalon extends Prenda {
        private String talla;
        private String estilo;

        public Pantalon(String talla, String estilo, double precio) {
            super("Pantalón", precio);
            this.talla = talla;
            this.estilo = estilo;
        }

        @Override
        public void mostrarDetalle() {
            super.mostrarDetalle();
            System.out.println("Talla: " + talla);
            System.out.println("Estilo: " + estilo);
        }
    }

    // Clase derivada Zapato
    public static class Zapato {
        private int tamaño;

        public Zapato(int tamaño, double precio) {
            super();
            this.tamaño = tamaño;
        }

    }

    // Clase principal de la aplicación
    public class VentaRopaElegante {

            // Crear instancias de prendas elegantes
            Camisa camisa1 = new Camisa("M", 49.99);
            Camisa camisa2 = new Camisa("L", 59.99, "Hugo Boss");
            Pantalon pantalon = new Pantalon("32", "Slim Fit", 79.99);
            Zapato zapato = new Zapato(10, 129.99);

            // Mostrar detalles de las prendas
            /*System.out.println("Detalles de la Camisa 1:");
            camisa1.mostrarDetalle();

            System.out.println("\nDetalles de la Camisa 2:");
            camisa2.mostrarDetalle();

            System.out.println("\nDetalles del Pantalón:");
            pantalon.mostrarDetalle();

            System.out.println("\nDetalles del Zapato:");
            zapato.mostrarDetalle();*/
        }
    }


