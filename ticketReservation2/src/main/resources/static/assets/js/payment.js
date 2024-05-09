const paymentHeaderBtns = [
    document.querySelector('#gcash-header'),
    document.querySelector('#bank-header'),
    document.querySelector('#card-header'),
    document.querySelector('#paypal-header')
];

// Add click event listeners to each payment header button
paymentHeaderBtns.forEach(button => {
    button.addEventListener('click', function (e) {
        e.preventDefault();

        const targetId = this.getAttribute('data-target'); // Get the ID of the target container
        const targetContainer = document.getElementById(targetId); // Get the target container

        document.querySelectorAll('.card-body').forEach(container => {
            if (container !== targetContainer) {
                container.style.display = 'none';
            }
        });
        
        // Toggle the visibility of the target container
        targetContainer.style.display = targetContainer.style.display === 'block' ? 'none' : 'block';
    });
});
