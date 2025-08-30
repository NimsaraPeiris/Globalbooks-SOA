#!/bin/bash
echo "Setting up GlobalBooks SOA project..."

# Start infrastructure
docker-compose up -d

# Wait for services to start
echo "Waiting for services to start..."
sleep 30

# Build all services
./scripts/build.sh

echo "Setup complete!"
echo "RabbitMQ Management: http://localhost:15672 (admin/admin)"
echo "PostgreSQL: localhost:5432 (admin/admin)"