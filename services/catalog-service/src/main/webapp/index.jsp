<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GlobalBooks Catalog Service</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 40px; }
        .header { background-color: #2c3e50; color: white; padding: 20px; border-radius: 5px; }
        .content { margin: 20px 0; }
        .link { display: block; margin: 10px 0; padding: 10px; background-color: #ecf0f1; border-radius: 3px; text-decoration: none; color: #2c3e50; }
        .link:hover { background-color: #bdc3c7; }
    </style>
</head>
<body>
    <div class="header">
        <h1>GlobalBooks Catalog Service</h1>
        <p>SOAP-based Web Service for Book Catalog Management</p>
    </div>
    
    <div class="content">
        <h2>Service Information</h2>
        <p><strong>Service Name:</strong> CatalogService</p>
        <p><strong>Version:</strong> 1.0.0</p>
        <p><strong>Status:</strong> <span style="color: green;">Active</span></p>
        
        <h2>Available Operations</h2>
        <ul>
            <li><strong>getBook(String id)</strong> - Retrieve book details by ID</li>
            <li><strong>searchBooks(String query)</strong> - Search books by title</li>
            <li><strong>updateStock(String id, int quantity)</strong> - Update book stock</li>
        </ul>
        
        <h2>Quick Links</h2>
        <a href="catalog?wsdl" class="link">📄 View WSDL</a>
        <a href="catalog" class="link">🔧 Service Endpoint</a>
        
        <h2>Testing</h2>
        <p>Import the WSDL into SOAP UI or use any SOAP client to test the service:</p>
        <code>http://localhost:8080/catalog-service/catalog?wsdl</code>
        
        <div style="margin-top: 30px; padding: 15px; background-color: #f8f9fa; border-left: 4px solid #007bff;">
            <strong>Note:</strong> This is a development environment. 
            Service is running with sample data for testing purposes.
        </div>
    </div>
    
    <footer style="margin-top: 40px; text-align: center; color: #7f8c8d;">
        <p>GlobalBooks SOA System - CCS3341 Assignment</p>
        <p>Generated on: <%= new java.util.Date() %></p>
    </footer>
</body>
</html>