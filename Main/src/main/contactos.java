package main;
    public static String ruta = "contactos.tsv";

 

    public static void main(String[] args) {

 

        Funcion<Contacto> imprimir = new Funcion<Contacto>() {

            @Override

            public void funcion(Contacto contacto, Object parametros) {

                out.println(contacto);

                int[] contador = (int[]) parametros;

                contador[0]++;

            }

        };

        Funcion<Contacto> imprimirEnArchivo = new Funcion<Contacto>() {

            @Override

            public void funcion(Contacto contacto, Object parametros) {

                PrintStream archivo = (PrintStream) parametros;

                archivo.print(contacto.getAlias() + "\t");

                archivo.print(contacto.getTelefono_fijo() + "\t");

                archivo.print(contacto.getTelefono_movil() + "\t");

                archivo.print(contacto.getCorreo() + "\n");

            }

        };

        if(!System.getProperties().get("os.name").equals("Linux") && System.console()!=null)

            try {

                out = new PrintStream(System.out, true, "CP850");

                teclado = new Scanner(System.in, "CP850");

            } catch (UnsupportedEncodingException e) {}

        Vector<Contacto> vector = new Vector<Contacto>();

        int i, n;

        Contacto dato = null, contacto;

        int[] contador = {0};

        int opcion, subopcion;

        String[] campos;

        try {

            Scanner entrada = new Scanner(new FileReader(ruta));

            while (entrada.hasNextLine()) {

                campos = entrada.nextLine().split("\t");

                contacto = new Contacto();

                contacto.setAlias(campos[0]);

                contacto.setTelefono_fijo(campos[1]);

                contacto.setTelefono_movil(campos[2]);

                contacto.setCorreo(campos[3]);

                vector.add(contacto);

            }

            entrada.close();

        } catch (FileNotFoundException e) {}

        contacto = new Contacto();

        do {

            out.println("MEN\u00DA");

            out.println("1.- Altas");

            out.println("2.- Consultas");

            out.println("3.- Actualizaciones");

            out.println("4.- Bajas");

            out.println("5.- Ordenar registros");

            out.println("6.- Listar registros");

            out.println("7.- Salir");

            do {

                opcion = leer_entero ("Seleccione una opci\u00F3n");

                if(opcion<1 || opcion>7)

                    out.println("Opci\u00F3nn no v\u00E1lida.");

            } while (opcion<1 || opcion>7);

            out.println();

            if (vector.isEmpty() && opcion!=1 && opcion!=7) {

                pausar("No hay registros.\n");

                continue;

            }

            if (opcion<5) {

                contacto.setAlias(leer_cadena ("Ingrese el alias del contacto"));

                i = vector.indexOf(contacto);

                dato = i<0 ? null : vector.get(i);

                if (dato!=null) {

                    out.println();

                    imprimir.funcion(dato, contador);

                }

            }

            if (opcion==1 && dato!=null)

                out.println("El registro ya existe.");

            else if (opcion>=2 && opcion<=4 && dato==null)

                out.println("\nRegistro no encontrado.");

            else switch (opcion) {

            case 1:

                contacto.setTelefono_fijo(leer_cadena ("Ingrese el telefono fijo"));

                contacto.setTelefono_movil(leer_cadena ("Ingrese el telefono movil"));

                contacto.setCorreo(leer_cadena ("Ingrese el correo"));

                vector.add(contacto);

                contacto = new Contacto();

                out.println("\nRegistro agregado correctamente.");

                break;

            case 3:

                out.println("Men\u00FA de modificaci\u00F3n de campos");

                out.println("1.- telefono fijo");

                out.println("2.- telefono movil");

                out.println("3.- correo");

                do {

                    subopcion = leer_entero ("Seleccione un n\u00FAmero de campo a modificar");

                    if (subopcion<1 || subopcion>3)

                        out.println("Opci\u00F3n no v\u00E1lida.");

                } while (subopcion<1 || subopcion>3);

                switch (subopcion) {

                    case 1:

                        dato.setTelefono_fijo(leer_cadena ("Ingrese el nuevo telefono fijo"));

                        break;

                    case 2:

                        dato.setTelefono_movil(leer_cadena ("Ingrese el nuevo telefono movil"));

                        break;

                    case 3:

                        dato.setCorreo(leer_cadena ("Ingrese el nuevo correo"));

                        break;

                }

                out.println("\nRegistro actualizado correctamente.");

                break;

            case 4:

                vector.remove(dato);

                out.println("Registro borrado correctamente.");

                break;

            case 5:

                Collections.sort(vector);

                out.println("Registros ordenados correctamente.");

                break;

            case 6:

                n = vector.size();

                contador[0] = 0;

                for (i=0; i<n; i++)

                    imprimir.funcion(vector.get(i), contador);

                out.println("Total de registros: " + contador[0] + ".");

                break;

            }

            if (opcion<7 && opcion>=1)

                pausar("");

        } while (opcion!=7);

        try {

            PrintStream salida = new PrintStream(ruta);

            n = vector.size();

            for (i=0; i<n; i++)

                imprimirEnArchivo.funcion(vector.get(i), salida);

            salida.close();

        } catch (FileNotFoundException e) {}

    }

}