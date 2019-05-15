::#!
@echo off
call scala %0 %*
goto :eof
::!#
println(s"Hello ${args(0)} !")