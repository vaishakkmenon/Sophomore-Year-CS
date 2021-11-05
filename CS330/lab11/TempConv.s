 .section .data
    inputA: .space 8 # space for 8 bytes
    inputB: .space 8

.section .rodata
    inputAString: .string "Input Celcius number:\n"
    testAString: .string "Celcius is: %d\n"
    inputBString: .string "Input Farenheit number:\n"
    testBString: .string "Farenheit is: %d\n"
    scanfString: .string "%d"
    resultAString: .string "Farenheit to Celcius: %d\n"
    resultBString: .string "Celcius to Farenheit: %d\n"

.text
.global main

FtoC:

# Prints out input instruction
movq $inputBString, %rdi
xor %rax, %rax
call printf

# Calls for user input
movq $scanfString, %rdi
movq $inputB, %rsi
xor %rax, %rax
call scanf

# Prints out what your input is 
movq $testBString, %rdi
movq inputB, %rsi
movq inputB, %r13
xor %rax, %rax
call printf

# Subtracts 32 from input Farenheit
subq $32, %r13

# Multiplies value from subtraction by 5
imulq $5, %r13

# Moves 9 into r9
movq $9, %r9
# Makes rdx 0 for division function
movq $0, %rdx
# Moves multiplication value from above into rax
movq %r13, %rax
# Divides rax by 9 which is stored in r9
idivq %r9

ret 

CtoF:

# Prints out input instruction
movq $inputAString, %rdi
xor %rax, %rax
call printf

# Calls for user input
movq $scanfString, %rdi
movq $inputA, %rsi
xor %rax, %rax
call scanf

# Prints out what your input is 
movq $testAString, %rdi
movq inputA, %rsi
movq inputA, %r12
xor %rax, %rax
call printf

# Multiplies input by 9
imulq $9, %r12
# Moves 5 into r9
movq $5, %r9

# Moves 0 into rdx for division function
movq $0, %rdx
# Moves current calculated value into rax for division
movq %r12, %rax
# Divides rax by 5 which is in r9
idivq %r9

# Adds 32 to rax
addq $32, %rax

ret 

main:
pushq %rbp
movq %rsp, %rbp

# Calls Farenheit to Celcius function
call FtoC

# Prints out result string with results from function
movq $resultAString, %rdi
movq %rax, %rsi
xor %rax, %rax
call printf

# Calls Celcius to Farenheit function
call CtoF

# Prints out result string with results from function
movq $resultBString, %rdi
movq %rax, %rsi
xor %rax, %rax
call printf

movq $0, %rax
leave
ret
