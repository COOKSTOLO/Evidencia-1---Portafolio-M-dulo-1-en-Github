# 📋 Instrucciones para Crear el Repositorio en GitHub

## 🚀 Paso a Paso para Subir el Portafolio a GitHub

### 1. 📂 Preparar los Archivos del Proyecto

Antes de subir a GitHub, necesitas copiar los archivos de tus proyectos originales a las carpetas correspondientes:

1. **Copia el contenido de `actividad1_alekseihabid`** → `portafolio-modulo1/HolaMundoApp/`
2. **Copia el contenido de `actividad2_alekseihabid`** → `portafolio-modulo1/LayoutApp/`
3. **Copia el contenido de `MyApplication3`** → `portafolio-modulo1/TouchApp/`

### 2. 🌐 Crear el Repositorio en GitHub

1. **Ir a GitHub:**
   - Accede a [https://github.com](https://github.com)
   - Inicia sesión en tu cuenta

2. **Crear Nuevo Repositorio:**
   - Haz clic en el botón "+" en la esquina superior derecha
   - Selecciona "New repository"

3. **Configurar el Repositorio:**
   - **Repository name:** `portafolio-modulo1`
   - **Description:** "Portafolio del Módulo 1 - Desarrollo de Aplicaciones Móviles Android"
   - **Visibility:** Public (recomendado para portafolio)
   - **Initialize this repository with:**
     - ✅ Add a README file (NO marcar, ya tenemos uno)
     - ✅ Add .gitignore → Selecciona "Android"
     - ❌ Choose a license (opcional)

4. **Crear el repositorio:**
   - Haz clic en "Create repository"

### 3. 📤 Subir los Archivos

**Opción A: Usando GitHub Web Interface (Más fácil)**

1. En tu nuevo repositorio, haz clic en "uploading an existing file"
2. Arrastra y suelta toda la carpeta `portafolio-modulo1`
3. Escribe el commit message: "Initial commit: Agregando proyectos del Módulo 1"
4. Haz clic en "Commit changes"

**Opción B: Usando Git desde la Terminal**

1. Abre PowerShell en la carpeta `portafolio-modulo1`
2. Ejecuta los siguientes comandos:

```powershell
# Inicializar repositorio git
git init

# Configurar tu información (si no lo has hecho antes)
git config --global user.name "Tu Nombre"
git config --global user.email "tu_email@ejemplo.com"

# Agregar todos los archivos
git add .

# Hacer el primer commit
git commit -m "Initial commit: Agregando proyectos del Módulo 1"

# Conectar con el repositorio remoto (reemplaza [usuario] con tu username de GitHub)
git remote add origin https://github.com/[usuario]/portafolio-modulo1.git

# Subir los archivos
git branch -M main
git push -u origin main
```

### 4. 👥 Agregar Colaborador

Para agregar a tu profesor/evaluador como colaborador:

1. **En tu repositorio de GitHub:**
   - Ve a "Settings" (pestaña en la parte superior)
   - En el menú lateral, selecciona "Manage access"
   - Haz clic en "Invite a collaborator"

2. **Invitar colaborador:**
   - Ingresa el username de GitHub de tu profesor
   - Selecciona el nivel de permisos: "Write" o "Admin"
   - Haz clic en "Add [username] to this repository"

3. **Confirmar invitación:**
   - GitHub enviará una invitación por email al colaborador
   - El colaborador debe aceptar la invitación para tener acceso

### 5. ✅ Verificar que Todo Esté Correcto

**Checklista final:**

- ✅ El repositorio tiene el nombre correcto: `portafolio-modulo1`
- ✅ Está configurado como público
- ✅ Contiene las 3 carpetas de proyectos: `HolaMundoApp`, `LayoutApp`, `TouchApp`
- ✅ Cada carpeta de proyecto tiene su propio `README.md`
- ✅ El `README.md` principal está en la raíz del repositorio
- ✅ Se agregó el colaborador correctamente
- ✅ Los archivos de código fuente están en las carpetas correctas

### 6. 📧 Información para Compartir

**Después de crear el repositorio, comparte esta información:**

- **URL del repositorio:** `https://github.com/[tu-usuario]/portafolio-modulo1`
- **Colaborador agregado:** ✅ Confirmado
- **Fecha de entrega:** [Fecha actual]

### 🔧 Comandos Git Útiles para el Futuro

```powershell
# Ver estado de los archivos
git status

# Agregar cambios específicos
git add nombre_archivo.txt

# Agregar todos los cambios
git add .

# Hacer commit con mensaje
git commit -m "Descripción de los cambios"

# Subir cambios al repositorio
git push

# Ver historial de commits
git log --oneline
```

### ⚠️ Notas Importantes

1. **Tamaño de archivos:** GitHub tiene límite de 100MB por archivo
2. **Archivos a ignorar:** El `.gitignore` de Android ya excluye archivos innecesarios como:
   - `/build/`
   - `/local.properties`
   - `*.apk`
   - `*.keystore`

3. **Privacidad:** Asegúrate de no subir información sensible como:
   - API keys
   - Contraseñas
   - Información personal confidencial

### 🆘 Ayuda y Troubleshooting

**Si tienes problemas:**

1. **Error de autenticación:** Verifica tu username y password de GitHub
2. **Archivos muy grandes:** Usa Git LFS o elimina archivos innecesarios
3. **Repositorio no aparece:** Verifica que sea público y que el nombre sea correcto
4. **Colaborador no puede acceder:** Confirma que aceptó la invitación

**Recursos útiles:**
- [GitHub Docs](https://docs.github.com)
- [Git Tutorial](https://git-scm.com/docs/gittutorial)
- [GitHub Desktop](https://desktop.github.com) (alternativa visual)

---

¡Listo! Una vez completados estos pasos, tu portafolio estará disponible públicamente en GitHub y tu profesor/evaluador podrá acceder como colaborador.