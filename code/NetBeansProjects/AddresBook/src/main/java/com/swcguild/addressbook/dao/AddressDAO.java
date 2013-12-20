/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dao;

import com.swcguild.addressbook.Address.Address;

/**
 *
 * @author apprentice
 */
public interface AddressDAO {

    public Address addContact(Address newAddress);

    public void removeAddress(String Address );

    public void updateContact(Address address) throws Exception;

    public Address[] getAllContacts();

    public Address getContact(String addyKey);
}
