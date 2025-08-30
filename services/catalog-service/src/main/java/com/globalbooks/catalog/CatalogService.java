package com.globalbooks.catalog;

import com.globalbooks.catalog.model.Book;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CatalogService {
    
    @WebMethod
    Book getBook(@WebParam(name = "id") String id);
    
    @WebMethod
    Book[] searchBooks(@WebParam(name = "query") String query);
    
    @WebMethod
    boolean updateStock(@WebParam(name = "id") String id, @WebParam(name = "quantity") int quantity);
}