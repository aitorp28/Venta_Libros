package modelo;

public class Cliente {
    private String documentacion;
    private String nombre;
    private String Apellido;
    private String Apellido_2;
    private String tlf;
    private String correo;
    private String kalea;
    private String kokapena;
    private String zenbakia;
    private String atea;
    
    public Cliente(String documentacion, String nombre, String apellido, String apellido_2,String tlf, String correo, String kokapena,String kalea,String zenbakia,String atea) {
        setDocumentacion(documentacion);
        setNombre(nombre);
        setApellido(apellido);
        setApellido_2(apellido_2);
        setTlf(tlf);
        setCorreo(correo);
        setKalea(kalea);
        setKokapena(kokapena);
        setZenbakia(zenbakia);
        setAtea(atea);
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getKalea() {
        return kalea;
    }

    public void setKalea(String kalea) {
        this.kalea = kalea;
    }

	public String getApellido_2() {
		return Apellido_2;
	}

	public void setApellido_2(String apellido_2) {
		Apellido_2 = apellido_2;
	}

	public String getKokapena() {
		return kokapena;
	}

	public void setKokapena(String kokapena) {
		this.kokapena = kokapena;
	}

	public String getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(String zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getAtea() {
		return atea;
	}

	public void setAtea(String atea) {
		this.atea = atea;
	}
    
}
