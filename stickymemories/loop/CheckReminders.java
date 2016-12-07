/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stickymemories.loop;

/**
 *
 * @author bernardovieira
 */
public class CheckReminders extends Thread {
    
    boolean hasNext;
    public CheckReminders()
    {
        this.hasNext = false;
    }
    
    @Override
    public void run()
    {
        if(hasNext == false)
        {
            //schedule next note
        }
        //schedule next note
    }
}
