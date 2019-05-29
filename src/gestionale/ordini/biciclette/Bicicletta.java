/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionale.ordini.biciclette;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Utente
 */
public class Bicicletta {
    private String tipo_bici;
    private String colore;
    private app a;
    private Date datao;
    public Bicicletta(String tipo_bici, String colore, app a, Date datao) {
        this.tipo_bici = tipo_bici;
        this.colore = colore;
        this.a = a;
        this.datao = datao;
    }
    
    private void aggiorna_originale(Giacenza g){
        a.setGiacenza(g);
    }
    
    public boolean si_può(Giacenza g){
        boolean s = false;
        boolean ruota = false, telaio = false, manubrio = false, cambio = true;
        if(this.tipo_bici.equals("A1")){
            if(g.getRuota_a() > 1){
                ruota = true;
                g.setRuota_a(g.getRuota_a()-2);
            }
            else if(g.getRaggi() > 71 && g.getCerchioni_a() > 1 && g.getGomma_a() > 1){
                ruota = true;
                g.setRaggi(g.getRaggi()-72);
                g.setCerchioni_a(g.getCerchioni_a() - 2);
                g.setGomma_a(g.getGomma_a()-2);
            }
            
            if(g.getTelai_a() > 0){
                if(this.colore.equals("01")){
                    if(g.getVernice_bianca() > 0.15){
                        telaio = true;
                        g.setVernice_bianca((int) (g.getVernice_bianca() - 0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("03")){
                    if(g.getVernice_grigio_chiaro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_chiaro((int) (g.getVernice_grigio_chiaro()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("09")){
                    if(g.getVernice_grigio_scuro()> 0.15){
                        telaio = true;                       
                        g.setVernice_grigio_scuro((int) (g.getVernice_grigio_scuro()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("24")){
                    if(g.getVernice_gialla()> 0.15){
                        telaio = true;
                        g.setVernice_gialla((int) (g.getVernice_gialla()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }
            }
            
            if(g.getManubri_a() > 0){
                manubrio = true;
                g.setManubri_a(g.getManubri_a() - 1);
            }
        }
        else if(this.tipo_bici.equals("A2")){
            if(g.getRuota_a() > 1){
                ruota = true;
                g.setRuota_a(g.getRuota_a()-2);
            }
            else if(g.getRaggi() > 71 && g.getCerchioni_a() > 1 && g.getGomma_a() > 1){
                ruota = true;
                g.setRaggi(g.getRaggi()-72);
                g.setCerchioni_a(g.getCerchioni_a() - 2);
                g.setGomma_a(g.getGomma_a()-2);
            }
            
            if(g.getTelai_a() > 0){
                if(this.colore.equals("01")){
                    if(g.getVernice_bianca() > 0.15){
                        telaio = true;
                        g.setVernice_bianca((int) (g.getVernice_bianca() - 0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("03")){
                    if(g.getVernice_grigio_chiaro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_chiaro((int) (g.getVernice_grigio_chiaro()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("09")){
                    if(g.getVernice_grigio_scuro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_scuro((int) (g.getVernice_grigio_scuro()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }else if(this.colore.equals("24")){
                    if(g.getVernice_gialla()> 0.15){
                        telaio = true;
                        g.setVernice_gialla((int) (g.getVernice_gialla()-0.15));
                        g.setTelai_a(g.getTelai_a()-1);
                    }
                }
            }
            
            if(g.getManubri_a() > 0){
                manubrio = true;
                g.setManubri_a(g.getManubri_a() - 1);
            }
            
            if(g.getCambio_donna() < 0){
                cambio = false;
            }else g.setCambio_donna(g.getCambio_donna()-1);
            
        }
        else if(this.tipo_bici.equals("B1")){
            if(g.getRuota_b() > 1){
                ruota = true;
                g.setRuota_b(g.getRuota_b() -1);
            }
            else if(g.getRaggi() > 71 && g.getCerchioni_b() > 1 && g.getGomma_b() > 1){
                ruota = true;
                g.setRaggi(g.getRaggi()-72);
                g.setCerchioni_b(g.getCerchioni_b()-2);
                g.setGomma_b(g.getGomma_b()-2);
            }
            if(g.getTelai_b() > 0){
                if(this.colore.equals("01")){
                    if(g.getVernice_bianca() > 0.15){
                        telaio = true;
                        g.setVernice_bianca((int) (g.getVernice_bianca()- 0.15));
                    }
                }else if(this.colore.equals("03")){
                    if(g.getVernice_grigio_chiaro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_chiaro((int) (g.getVernice_grigio_chiaro()- 0.15));
                    }
                }else if(this.colore.equals("09")){
                    if(g.getVernice_grigio_scuro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_scuro((int) (g.getVernice_grigio_scuro()- 0.15));
                    }
                }else if(this.colore.equals("24")){
                    if(g.getVernice_gialla()> 0.15){
                        telaio = true;
                        g.setVernice_gialla((int) (g.getVernice_gialla()- 0.15));
                    }
                }
            }
            
            if(g.getManubri_b() > 0){
                manubrio = true;
                g.setManubri_b(g.getManubri_b()-1);
            }
        }
        else if(this.tipo_bici.equals("B2")){
            if(g.getRuota_b() > 1){
                ruota = true;
                g.setRuota_b(g.getRuota_b() -1);
            }
            else if(g.getRaggi() > 71 && g.getCerchioni_b() > 1 && g.getGomma_b() > 1){
                ruota = true;
                g.setRaggi(g.getRaggi()-72);
                g.setCerchioni_b(g.getCerchioni_b()-2);
                g.setGomma_b(g.getGomma_b()-2);
            }
            if(g.getTelai_b() > 0){
                if(this.colore.equals("01")){
                    if(g.getVernice_bianca() > 0.15){
                        telaio = true;
                        g.setVernice_bianca((int) (g.getVernice_bianca()- 0.15));
                    }
                }else if(this.colore.equals("03")){
                    if(g.getVernice_grigio_chiaro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_chiaro((int) (g.getVernice_grigio_chiaro()- 0.15));
                    }
                }else if(this.colore.equals("09")){
                    if(g.getVernice_grigio_scuro()> 0.15){
                        telaio = true;
                        g.setVernice_grigio_scuro((int) (g.getVernice_grigio_scuro()- 0.15));
                    }
                }else if(this.colore.equals("24")){
                    if(g.getVernice_gialla()> 0.15){
                        telaio = true;
                        g.setVernice_gialla((int) (g.getVernice_gialla()- 0.15));
                    }
                }
            }
            
            if(g.getManubri_b() > 0){
                manubrio = true;
                g.setManubri_b(g.getManubri_b()-1);
            }
            
            if(g.getCambio_uomo() < 1){
                cambio = false;
                g.setCambio_uomo(g.getCambio_uomo()-1);
            }
        }
        else if(this.tipo_bici.equals("C1")){
            if(g.getRuota_c() > 1)
                ruota = true;
            else if(g.getRaggi() > 71 && g.getCerchioni_c() > 2 && g.getGomma_c() > 1)
                ruota = true;
            
            if(g.getTelai_c() > 0){
                if(this.colore.equals("01")){
                    if(g.getVernice_bianca() > 0.15)
                        telaio = true;
                }else if(this.colore.equals("03")){
                    if(g.getVernice_grigio_chiaro()> 0.15)
                        telaio = true;
                }else if(this.colore.equals("09")){
                    if(g.getVernice_grigio_scuro()> 0.15)
                        telaio = true;
                }else if(this.colore.equals("24")){
                    if(g.getVernice_gialla()> 0.15)
                        telaio = true;
                }
            }
            
            if(g.getManubri_c() > 0)
                manubrio = true;
            
            if(g.getCambio_uomo() < 1)
                cambio = false;
        }
        
        if(ruota == true && telaio == true && manubrio == true && cambio == true){
            s = true;
            Calendar dataoi = Calendar.getInstance(); 
            dataoi.setTime(datao);
            dataoi.add(Calendar.DATE, 10);
            Date datella = dataoi.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
            String strDate = dateFormat.format(datella);
            JOptionPane.showMessageDialog(a,"Ordine commissionato con successo!\n" + this.toString() + "\n" + "Data minima di consegna prevista: " + strDate );
        }
        
        aggiorna_originale(g);
        return s;
    }
    
    public boolean data_valida(Date d){
        boolean r = false;
        Calendar cal_d = Calendar.getInstance(); 
        Calendar cal_n = Calendar.getInstance(); 
        cal_n.setTime(new Date()); 
        cal_d.setTime(d);
        
        cal_n.add(Calendar.DATE, 10);
        
        if(cal_d.after(cal_n))
            r = true;
        return r;
    }

    @Override
    public String toString() {
        return "Bicicletta\n" + "tipo bici: " + tipo_bici + "\ncolore: " + colore;
    }
    
    
}
