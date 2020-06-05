/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survey;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rafli
 */
@Stateless
public class MahasiswaFacade extends AbstractFacade<Mahasiswa> {

    @PersistenceContext(unitName = "tugas_surveyPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MahasiswaFacade() {
        super(Mahasiswa.class);
    }
    
}
