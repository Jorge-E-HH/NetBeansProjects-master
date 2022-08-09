
package modelo;
/**
     * Busca un contacto en la lista de contactos
     *
     * @param id, nÃºmero de identificaciÃ³n del contacto
     * @return, el contacto si se encuentra, null en caso contrario
     */
    public Contacto buscarContacto(String id) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getId().equals(id)) {
                return contactos.get(i);
            }
        }
        return null;
    }
