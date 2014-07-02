noremap l h
noremap ; l
noremap h ;

noremap j gj
noremap k gk

set hlsearch
set number
set timeoutlen=500
set smartindent
set autoindent
set ignorecase
set smartcase
set nocompatible
set hidden
set nowrap
set backspace=indent,eol,start
set copyindent
set smarttab
set title
set nobackup
set noswapfile


filetype on
filetype indent on


let mapleader = " "

map <Leader>r ireturn 
map <Leader>c :
map <Leader>o o<Esc>
map <Leader>O O<Esc>
map <Leader>s :w<Enter>
map <Leader>q :q!
"text bubbling
nmap <Leader>k ddkP
nmap <Leader>j ddp
vmap <Leader>k xkP`[V`]
vmap <Leader>j xp`[V`]
