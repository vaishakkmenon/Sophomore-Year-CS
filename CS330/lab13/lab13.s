.section .data
    myArr: .quad 1, 2, 3, 4, 5

.section .rodata
    inputNumString: .string "Input a number for the array: %d\n"
    testNumString: .string "Inputted num is: %d\n"
    scanfString: .string "%d"

.text
.global main

startAddNums:

movq $4, %r12
movq $myArr, %rbx
movq $0, %r13

call addNums

addNums:

movq (%rbx, %r13, 8), %r14

cmp %r13, %r12
inc %r13

jg addNums
je backToMain1
main:

pushq %rbp
movq %rsp, %rbp

call startAddNums
backToMain1:


movq $0, %rax
leave
ret
