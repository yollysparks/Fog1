/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Casper
 */
public class ModelFacade {
    

public static void validate( String username, String password ) throws LoginError {
        if ( "indeche".equals( password ) ) {
            return;
        }
        throw new LoginError();
    }
}