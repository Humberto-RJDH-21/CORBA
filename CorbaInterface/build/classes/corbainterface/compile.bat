:: Directorio de java SDK
SET JAVA_HOME="/usr/bin/"

:: direccion de las fuentes SRC de proyecto netbeans IDL "CorbaFiboInterface"
SET PATH_IDL="X:\carpeta_de_tu_proyecto\corba\CorbaFiboInterface\src"

:: nombre del archivo IDL
SET IDL_NAME=fibonacci.idl

:: comando para compilar
%JAVA_HOME%\bin\idlj -fall -td %PATH_IDL% %PATH_IDL%\%IDL_NAME%
