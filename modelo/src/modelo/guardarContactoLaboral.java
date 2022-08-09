
package modelo;
/**
     * Agrega un nuevo contacto laboral a la lista de contactos
     *
     * @param id, nÃºmero de identificaciÃ³n del contacto
     * @param n, nombre del contacto
     * @param tel, nÃºmero telefÃ³nico del contacto
     * @param gen, gÃ©nero del contacto
     * @param e, email del contacto
     * @return, true si el contacto se agrega, false si y existe
     */
    public boolean guardarContactoLaboral(String id, String n, String tel, String gen,
            String e) {
        Contacto c = buscarContacto(id);
        //Si el contacto existe como Contacto Laboral, no se podrÃ¡ agregar
        if (c != null && c instanceof ContactoLaboral) {
            return false;
        }
        contLaboral = new ContactoLaboral(id, n, gen, tel, e);
        contactos.add(contLaboral);

        return true;
    }