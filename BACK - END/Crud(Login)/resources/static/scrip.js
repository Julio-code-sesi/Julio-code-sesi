ocument.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');
 
    loginForm.addEventListener('submit', (event) => {
        event.preventDefault();
 
        const email = document.getElementById('email').value;
 
        if (email) {
            alert(`Login bem-sucedido! Bem-vindo ao Epic Games, ${email}!`);
 
            window.location.href = "pagina-inicial.html";
        } else {
            alert("Por favor, preencha o campo de e-mail.");
        }
    });
});
 