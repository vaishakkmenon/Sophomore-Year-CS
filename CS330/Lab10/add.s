.section .data
    inputA: .space 8 # space for 8 bytes
    inputB: .space 8

.section .rodata
    myString: .string "The result is: %d\n"
    myString2: .string "The sum of %d and %d is %d\n"
    inputString: .string "Please enter an int\n"
    scanfString: .string "%d"

.text
.global main
main:
# preamble
pushq %rbp
movq %rsp, %rbp

# code here

# User Input

movq $inputString, %rdi
xor %rax, %rax
call printf

movq $scanfString, %rdi
movq $inputA, %rsi
xor %rax, %rax
call scanf

movq inputA, %rax

/*
movq $scanfString, %rdi
movq $inputB, %rsi
xor %rax, %rax
call scanf

movq inputB, %rbx
*/

#movq $2, %rax
pushq %rax
# movq %rax, %rsi
# movq $3, %rbx
pushq %rbx
# movq %rbx, %rdx
addq %rbx, %rax
# movq %rax, %rcx


# movq $myString, %rdi
# movq %rax, %rsi
movq $myString2, %rdi
popq %rdx
popq %rsi
movq %rax, %rcx
# movq $0, %rax
xor %rax, %rax
call printf

# return
movq $0, %rax
leave
ret
