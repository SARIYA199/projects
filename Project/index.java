// Simple authentication simulation
const users = [];

document.getElementById('loginForm')?.addEventListener('submit', function(e) {
    e.preventDefault();
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    
    const user = users.find(u => u.email === email && u.password === password);
    if (user) {
        alert(`Welcome, ${user.name}`);
        if (user.role === 'student') {
            window.location.href = 'student-profile.html';
        } else {
            window.location.href = 'teacher-profile.html';
        }
    } else {
        alert('Invalid credentials');
    }
});

document.getElementById('registrationForm')?.addEventListener('submit', function(e) {
    e.preventDefault();
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const role = document.getElementById('role').value;

    users.push({ name, email, password, role });
    alert('Registration successful!');
    window.location.href = 'index.html';
});

function logout() {
    alert('Logged out');
    window.location.href = 'index.html';
}
