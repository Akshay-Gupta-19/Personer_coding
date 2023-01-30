/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author guptaakshay
 */
public class RemoteAdapter implements TvCicurit{
    Remote remote;

    public RemoteAdapter(Remote remote) {
        this.remote = remote;
    }
    
    @Override
    public void nextChannel() {
        remote.nextChannel(1);
    }

}
