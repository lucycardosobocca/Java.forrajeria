{
  "info": {
    "name": "API Carrito - Talento Tech",
    "description": "API completa para gestión de carrito de compras con Spring Boot",
    "schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
  },
  "item": [
    {
      "name": "CLIENTES",
      "description": "Endpoints para gestión de clientes",
      "item": [
        {
          "name": "Obtener todos los clientes",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes"]
            }
          }
        },
        {
          "name": "Obtener cliente por ID",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "1"]
            }
          }
        },
        {
          "name": "Buscar cliente por email",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/email/juan@example.com",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "email", "juan@example.com"]
            }
          }
        },
        {
          "name": "Buscar cliente por DNI",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/dni/12345678",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "dni", "12345678"]
            }
          }
        },
        {
          "name": "Verificar si existe cliente por email",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/existe/email/juan@example.com",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "existe", "email", "juan@example.com"]
            }
          }
        },
        {
          "name": "Verificar si existe cliente por DNI",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/existe/dni/12345678",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "existe", "dni", "12345678"]
            }
          }
        },
        {
          "name": "Buscar clientes por nombre o apellido",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/buscar/juan",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "buscar", "juan"]
            }
          }
        },
        {
          "name": "Crear cliente",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"nombre\": \"Juan\",\n  \"apellido\": \"Pérez\",\n  \"email\": \"juan.perez@example.com\",\n  \"dni\": \"12345678\",\n  \"telefono\": \"1234567890\",\n  \"direccion\": \"Calle Falsa 123, Buenos Aires\"\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/clientes",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes"]
            }
          }
        },
        {
          "name": "Actualizar cliente",
          "request": {
            "method": "PUT",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"nombre\": \"Juan Carlos\",\n  \"apellido\": \"Pérez\",\n  \"email\": \"juan.perez@example.com\",\n  \"dni\": \"12345678\",\n  \"telefono\": \"1234567890\",\n  \"direccion\": \"Calle Falsa 123, Buenos Aires\"\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "1"]
            }
          }
        },
        {
          "name": "Eliminar cliente",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "1"]
            }
          }
        },
        {
          "name": "Validar cliente",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"nombre\": \"María\",\n  \"apellido\": \"González\",\n  \"email\": \"maria.gonzalez@example.com\",\n  \"dni\": \"87654321\",\n  \"telefono\": \"0987654321\",\n  \"direccion\": \"Av. Libertador 456, Buenos Aires\"\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/clientes/validar",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "clientes", "validar"]
            }
          }
        }
      ]
    },
    {
      "name": "ARTÍCULOS",
      "description": "Endpoints para gestión de artículos",
      "item": [
        {
          "name": "Obtener todos los artículos",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos"]
            }
          }
        },
        {
          "name": "Obtener artículos activos",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/activos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "activos"]
            }
          }
        },
        {
          "name": "Obtener artículos disponibles (con stock)",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/disponibles",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "disponibles"]
            }
          }
        },
        {
          "name": "Obtener artículo por ID",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1"]
            }
          }
        },
        {
          "name": "Buscar artículos por nombre",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/buscar/notebook",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "buscar", "notebook"]
            }
          }
        },
        {
          "name": "Buscar artículos por rango de precios",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/precio?min=100&max=500",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "precio"],
              "query": [
                {
                  "key": "min",
                  "value": "100"
                },
                {
                  "key": "max",
                  "value": "500"
                }
              ]
            }
          }
        },
        {
          "name": "Obtener artículos con stock bajo",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/stock-bajo/10",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "stock-bajo", "10"]
            }
          }
        },
        {
          "name": "Obtener artículos ordenados por precio ASC",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/ordenar/precio-asc",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "ordenar", "precio-asc"]
            }
          }
        },
        {
          "name": "Obtener artículos ordenados por precio DESC",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/ordenar/precio-desc",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "ordenar", "precio-desc"]
            }
          }
        },
        {
          "name": "Crear artículo",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"nombre\": \"Notebook Lenovo\",\n  \"precio\": 75000.00,\n  \"descripcion\": \"Notebook Lenovo IdeaPad 3 Intel Core i5 8GB RAM 256GB SSD\",\n  \"stock\": 50\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/articulos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos"]
            }
          }
        },
        {
          "name": "Actualizar artículo",
          "request": {
            "method": "PUT",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"nombre\": \"Notebook Lenovo IdeaPad 3\",\n  \"precio\": 72000.00,\n  \"descripcion\": \"Notebook Lenovo IdeaPad 3 Intel Core i5 8GB RAM 256GB SSD - Actualizado\",\n  \"stock\": 45,\n  \"activo\": true\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1"]
            }
          }
        },
        {
          "name": "Eliminar artículo (lógico)",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1"]
            }
          }
        },
        {
          "name": "Eliminar artículo físicamente",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1/fisico",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1", "fisico"]
            }
          }
        },
        {
          "name": "Actualizar stock",
          "request": {
            "method": "PUT",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1/stock?stock=100",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1", "stock"],
              "query": [
                {
                  "key": "stock",
                  "value": "100"
                }
              ]
            }
          }
        },
        {
          "name": "Reducir stock",
          "request": {
            "method": "PUT",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1/stock/reducir?cantidad=5",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1", "stock", "reducir"],
              "query": [
                {
                  "key": "cantidad",
                  "value": "5"
                }
              ]
            }
          }
        },
        {
          "name": "Aumentar stock",
          "request": {
            "method": "PUT",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1/stock/aumentar?cantidad=10",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1", "stock", "aumentar"],
              "query": [
                {
                  "key": "cantidad",
                  "value": "10"
                }
              ]
            }
          }
        },
        {
          "name": "Verificar stock suficiente",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/articulos/1/stock/verificar?cantidad=5",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "articulos", "1", "stock", "verificar"],
              "query": [
                {
                  "key": "cantidad",
                  "value": "5"
                }
              ]
            }
          }
        }
      ]
    },
    {
      "name": "PEDIDOS",
      "description": "Endpoints para gestión de pedidos",
      "item": [
        {
          "name": "Obtener todos los pedidos",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos"]
            }
          }
        },
        {
          "name": "Obtener pedido por ID",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1"]
            }
          }
        },
        {
          "name": "Buscar pedidos por email del cliente",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/cliente/email/juan.perez@example.com",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "cliente", "email", "juan.perez@example.com"]
            }
          }
        },
        {
          "name": "Buscar pedidos por cliente ID",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/cliente/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "cliente", "1"]
            }
          }
        },
        {
          "name": "Buscar pedidos por estado",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/estado/PENDIENTE",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "estado", "PENDIENTE"]
            }
          }
        },
        {
          "name": "Buscar pedidos entre fechas",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/fecha?fechaInicio=2024-01-01T00:00:00&fechaFin=2024-12-31T23:59:59",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "fecha"],
              "query": [
                {
                  "key": "fechaInicio",
                  "value": "2024-01-01T00:00:00"
                },
                {
                  "key": "fechaFin",
                  "value": "2024-12-31T23:59:59"
                }
              ]
            }
          }
        },
        {
          "name": "Crear pedido básico",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"emailCliente\": \"juan.perez@example.com\",\n  \"fechaEntrega\": \"2024-12-30T10:00:00\",\n  \"observaciones\": \"Entregar en horario de oficina\"\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos"]
            }
          }
        },
        {
          "name": "Crear pedido con artículos",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"emailCliente\": \"juan.perez@example.com\",\n  \"fechaEntrega\": \"2024-12-30T10:00:00\",\n  \"observaciones\": \"Pedido completo con artículos\",\n  \"articulos\": [\n    {\n      \"articuloId\": 1,\n      \"cantidad\": 2\n    },\n    {\n      \"articuloId\": 2,\n      \"cantidad\": 1\n    }\n  ]\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/con-articulos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "con-articulos"]
            }
          }
        },
        {
          "name": "Agregar artículo a pedido existente",
          "request": {
            "method": "POST",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"articuloId\": 1,\n  \"cantidad\": 3\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1/articulos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1", "articulos"]
            }
          }
        },
        {
          "name": "Actualizar pedido",
          "request": {
            "method": "PUT",
            "header": [
              {
                "key": "Content-Type",
                "value": "application/json"
              }
            ],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"estado\": \"PROCESANDO\",\n  \"fechaEntrega\": \"2024-12-31T15:00:00\",\n  \"observaciones\": \"Pedido actualizado - entregar por la tarde\"\n}"
            },
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1"]
            }
          }
        },
        {
          "name": "Cambiar estado del pedido",
          "request": {
            "method": "PUT",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1/estado?estado=COMPLETADO",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1", "estado"],
              "query": [
                {
                  "key": "estado",
                  "value": "COMPLETADO"
                }
              ]
            }
          }
        },
        {
          "name": "Eliminar pedido",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1"]
            }
          }
        },
        {
          "name": "Obtener artículos de un pedido",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1/articulos",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1", "articulos"]
            }
          }
        },
        {
          "name": "Contar pedidos por cliente",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/cliente/1/count",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "cliente", "1", "count"]
            }
          }
        },
        {
          "name": "Calcular total de pedido",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "{{BASE_URL}}/api/pedidos/1/total",
              "host": ["{{BASE_URL}}"],
              "path": ["api", "pedidos", "1", "total"]
            }
          }
        }
      ]
    }
  ],
  "variable": [
    {
      "key": "BASE_URL",
      "value": "http://localhost:8080",
      "description": "URL base de la API"
    }
  ]
}