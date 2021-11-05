# Storage for input
.section .data
    inputA: .space 8 # space for 8 bytes
    inputB: .space 8

.section .rodata
    inputAString: .string "Input first number: %d\n"
    inputBString: .string "Input second number: %d\n"
    scanfString: .string "%d"

.text
.global main
main:

movq $inputAString, %rdi
call printf
movq $inputA, %rsi
call scanf

#movq $inputBString, %rdx
#movq $inputB, %rcx
