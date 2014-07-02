noremap l h
noremap ; l
noremap h ;

set hlsearch
set number
set timeoutlen=500
set smartindent
set autoindent
set ignorecase
set smartcase
set nocompatible

filetype on
filetype indent on


let mapleader = " "

map <Leader>r ireturn 
map <Leader>o o<Esc>
map <Leader>O O<Esc>
map <Leader>s :w<Enter>
"text bubbling
nmap <Leader>k ddkP
nmap <Leader>j ddp
vmap <Leader>k xkP`[V`]
vmap <Leader>j xp`[V`]
