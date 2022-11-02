/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ['./src/**/*.{html,js,svelte,ts}'],
  mode: 'jit',
  theme: {
    extend: {},
    fontSize: {
      xs: '0.5rem',
      sm: '0.8rem',
      lg: '1.5rem'
    }
  },
  plugins: [],
}
