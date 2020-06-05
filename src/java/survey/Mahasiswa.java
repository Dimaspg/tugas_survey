/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafli
 */
@Entity
@Table(name = "mahasiswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mahasiswa.findAll", query = "SELECT m FROM Mahasiswa m"),
    @NamedQuery(name = "Mahasiswa.findById", query = "SELECT m FROM Mahasiswa m WHERE m.id = :id"),
    @NamedQuery(name = "Mahasiswa.findByNama", query = "SELECT m FROM Mahasiswa m WHERE m.nama = :nama"),
    @NamedQuery(name = "Mahasiswa.findByNim", query = "SELECT m FROM Mahasiswa m WHERE m.nim = :nim"),
    @NamedQuery(name = "Mahasiswa.findByAngkatan", query = "SELECT m FROM Mahasiswa m WHERE m.angkatan = :angkatan"),
    @NamedQuery(name = "Mahasiswa.findByPertanyaan1", query = "SELECT m FROM Mahasiswa m WHERE m.pertanyaan1 = :pertanyaan1"),
    @NamedQuery(name = "Mahasiswa.findByPertanyaan2", query = "SELECT m FROM Mahasiswa m WHERE m.pertanyaan2 = :pertanyaan2"),
    @NamedQuery(name = "Mahasiswa.findByPertanyaan3", query = "SELECT m FROM Mahasiswa m WHERE m.pertanyaan3 = :pertanyaan3"),
    @NamedQuery(name = "Mahasiswa.findByPertanyaan4", query = "SELECT m FROM Mahasiswa m WHERE m.pertanyaan4 = :pertanyaan4"),
    @NamedQuery(name = "Mahasiswa.findByPertanyaan5", query = "SELECT m FROM Mahasiswa m WHERE m.pertanyaan5 = :pertanyaan5")})
public class Mahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nama")
    private String nama;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nim")
    private int nim;
    @Basic(optional = false)
    @NotNull
    @Column(name = "angkatan")
    private int angkatan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pertanyaan 1")
    private String pertanyaan1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pertanyaan 2")
    private String pertanyaan2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pertanyaan 3")
    private String pertanyaan3;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pertanyaan 4")
    private String pertanyaan4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "pertanyaan 5")
    private String pertanyaan5;

    public Mahasiswa() {
    }

    public Mahasiswa(Integer id) {
        this.id = id;
    }

    public Mahasiswa(Integer id, String nama, int nim, int angkatan, String pertanyaan1, String pertanyaan2, String pertanyaan3, String pertanyaan4, String pertanyaan5) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.pertanyaan1 = pertanyaan1;
        this.pertanyaan2 = pertanyaan2;
        this.pertanyaan3 = pertanyaan3;
        this.pertanyaan4 = pertanyaan4;
        this.pertanyaan5 = pertanyaan5;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getPertanyaan1() {
        return pertanyaan1;
    }

    public void setPertanyaan1(String pertanyaan1) {
        this.pertanyaan1 = pertanyaan1;
    }

    public String getPertanyaan2() {
        return pertanyaan2;
    }

    public void setPertanyaan2(String pertanyaan2) {
        this.pertanyaan2 = pertanyaan2;
    }

    public String getPertanyaan3() {
        return pertanyaan3;
    }

    public void setPertanyaan3(String pertanyaan3) {
        this.pertanyaan3 = pertanyaan3;
    }

    public String getPertanyaan4() {
        return pertanyaan4;
    }

    public void setPertanyaan4(String pertanyaan4) {
        this.pertanyaan4 = pertanyaan4;
    }

    public String getPertanyaan5() {
        return pertanyaan5;
    }

    public void setPertanyaan5(String pertanyaan5) {
        this.pertanyaan5 = pertanyaan5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mahasiswa)) {
            return false;
        }
        Mahasiswa other = (Mahasiswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "survey.Mahasiswa[ id=" + id + " ]";
    }
    
}
