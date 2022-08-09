
package modelo;
/**
     * Agrega un nuevo contacto personal a la lista de contactos
     *
     * @param id, nÃºmero de identificaciÃ³n del contacto
     * @param n, nombre del contacto
     * @param tel, nÃºmero telefÃ³nico del contacto
     * @param gen, gÃ©nero del contacto
     * @param f, fecha de cumpleaÃ±os del contacto
     * @return, true si el contacto se agrega, false si y existe
     */
    public boolean guardarContactoPersonal(String id, String n, String tel, String gen, Fecha f) throws IOException {
        Contacto c = buscarContacto(id);
        //Si el contacto existe como Contacto Personal, no se podrÃ¡ agregar
        if (c != null && c instanceof ContactoPersonal) {
            return false;
        }
        contPersonal = new ContactoPersonal(id, n, gen, tel, f);
        contactos.add(contPersonal);

        return true;
    }

import java.io.IOException;

