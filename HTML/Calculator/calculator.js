let num1=document.getElementById("number1");
let num2=document.getElementById("number2");
let h1Tag=document.getElementById("h1-tag");

function driver(callback)
{
	let n1=Number(num1.value);
	let n2=Number(num2.value);
    h1Tag.innerText=callback(n1,n2);
}
function add(n1,n2)
{
	return `${n1} + ${n2} = ${n1+n2}`;	
}
function sub(n1,n2)
{
	return `${n1} - ${n2} = ${n1-n2}`;	
}
function mul(n1,n2)
{
	return `${n1} * ${n2} = ${n1*n2}`;	
}
function div(n1,n2)
{
	return `${n1} / ${n2} = ${Math.trunc(n1/n2)}`;
}
