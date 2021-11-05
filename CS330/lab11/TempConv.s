 .section .data
    inputA: .space 8 # space for 8 bytes
    inputB: .space 8

.section .rodata
    inputAString: .string "Input Celcius number:\n"
    testAString: .string "A is: %d\n"
    inputBString: .string "Input Farenheit number:\n"
    testBString: .string "B is: %d\n"
    scanfString: .string "%d"
    resultAString: .string "Farenheit to Celcius: %d\n"
    resultBString: .string "Celcius to Farenheit: %d\n"

.text
.global main

FtoC:

movq $inputBString, %rdi
xor %rax, %rax
call printf

movq $scanfString, %rdi
movq $inputB, %rsi
xor %rax, %rax
call scanf

movq $testBString, %rdi
movq inputB, %rsi
movq inputB, %r13
xor %rax, %rax
call printf

subq $32, %r13
imulq $5, %r13

movq $9, %r9
movq $0, %rdx
movq %r13, %rax
idivq %r9

ret 

CtoF:

movq $inputAString, %rdi
xor %rax, %rax
call printf

movq $scanfString, %rdi
movq $inputA, %rsi
xor %rax, %rax
call scanf

movq $testAString, %rdi
movq inputA, %rsi
movq inputA, %r12
xor %rax, %rax
call printf

imulq $9, %r12
movq $5, %r9

movq $0, %rdx
movq %r12, %rax
idivq %r9

addq $32, %rax

ret 

main:
pushq %rbp
movq %rsp, %rbp

call FtoC

movq $resultAString, %rdi
movq %rax, %rsi
xor %rax, %rax
call printf

call CtoF

movq $resultBString, %rdi
movq %rax, %rsi
xor %rax, %rax
call printf

movq $0, %rax
leave
ret
