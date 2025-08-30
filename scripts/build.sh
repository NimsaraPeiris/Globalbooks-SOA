#!/bin/bash
echo "Building all services..."

# Build Catalog Service
cd services/catalog-service
mvn clean package
cd ../..

# Build Orders Service
cd services/orders-service
mvn clean package
cd ../..

# Build other services...

echo "All services built successfully!"